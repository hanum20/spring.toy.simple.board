package com.hanum.simple.board.control;

import com.hanum.simple.board.domain.Post;
import com.hanum.simple.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/posts")
    public Page<Post> getPost(@PageableDefault(size= 10, sort="title", direction= Sort.Direction.DESC) Pageable pageable) {
        return boardService.getPostPage(pageable);
    }

    @GetMapping("/posts/{id}")
    public String getPostById(@PathVariable Long id, Model model){
        // page가 없을 경우 exception
        Post post = boardService.getPostById(id);
        model.addAttribute(post);
        return "/board/post";
    }

    @GetMapping("/posts/form")
    public String postForm(){
        return "/board/form";
    }

    @PostMapping("/posts")
    public String createPost(@Validated @ModelAttribute Post post,
                             BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "/board/form";
        }

        boardService.createPost(post);
        return "redirect:/posts/" + post.getId();
    }
}

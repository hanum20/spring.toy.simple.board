package com.hanum.simple.board.control;

import com.hanum.simple.board.domain.Post;
import com.hanum.simple.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/posts")
    public Page<Post> getPost(@PageableDefault(size= 10, sort="title", direction= Sort.Direction.DESC) Pageable pageable) {
        return boardService.getPostPage(pageable);
    }
}

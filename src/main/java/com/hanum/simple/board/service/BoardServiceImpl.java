package com.hanum.simple.board.service;

import com.hanum.simple.board.entity.Account;
import com.hanum.simple.board.entity.Post;
import com.hanum.simple.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    PostRepository postRepository;

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void setNewPost(String title, Account account) {
        Post post = new Post();
        post.setTitle(title);
        post.setAccount(account);
        postRepository.save(post);
    }

    @Override
    public List<Post> getPostAll() {
        return postRepository.findAll();
    }
}

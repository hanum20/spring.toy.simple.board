package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Post;
import com.hanum.simple.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void createPost(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> getPostAll() {
        return postRepository.findAll();
    }

    @Override
    public Page<Post> getPostPage(Pageable pageable) {
        return postRepository.findAll(pageable);
    }
}

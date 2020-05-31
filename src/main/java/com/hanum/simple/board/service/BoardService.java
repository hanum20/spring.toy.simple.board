package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    public Post getPostById(Long id);
    public void createPost(Post post);
    public List<Post> getPostAll();
    public Page<Post> getPostPage(Pageable pageable);
}

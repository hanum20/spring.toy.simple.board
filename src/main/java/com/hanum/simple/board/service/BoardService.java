package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Account;
import com.hanum.simple.board.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    public Post getPostById(Long id);
    public void setNewPost(String title, Account account);
    public List<Post> getPostAll();
    public Page<Post> getPostPage(Pageable pageable);
}

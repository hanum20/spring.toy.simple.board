package com.hanum.simple.board.service;

import com.hanum.simple.board.entity.Account;
import com.hanum.simple.board.entity.Post;

import java.util.List;

public interface BoardService {
    public Post getPostById(Long id);
    public void setNewPost(String title, Account account);
    public List<Post> getPostAll();
}

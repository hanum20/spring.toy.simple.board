package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Account;
import com.hanum.simple.board.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardServiceImplTest {

    @Autowired
    BoardService boardService;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    public void getPostById() {
        System.out.print("Long >>");

        System.out.println(boardService.getPostById(2l).toString());
    }

    @Test
    public void setNewPost() {
        // new account instance
        Account account = new Account();
        account.setUsername("hello");
        account.setPassword("pass");

        // new account status is persistent
        Account savedAccount = accountRepository.save(account);

        // new post status is persistent
        //boardService.createPost("test0000",savedAccount);
    }

    @Test
    public void getPostAll() {
        boardService.getPostAll().forEach(System.out::println);
    }

    @Test
    public void getPostPage() {

    }
}
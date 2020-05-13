package com.hanum.simple.board.repository;

import com.hanum.simple.board.domain.Account;
import com.hanum.simple.board.domain.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
public class postRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    public void save(){
        // account 객체 생성
        Account account = new Account();
        account.setUsername("Hanum");
        account.setPassword("pass");
        Account savedAccount = accountRepository.save(account);

        Post post = new Post();
        post.setTitle("Post");
        post.setAccount(savedAccount);
        postRepository.save(post);

        entityManager.flush();
    }


}
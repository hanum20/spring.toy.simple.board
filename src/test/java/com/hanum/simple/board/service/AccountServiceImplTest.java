package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Account;
import com.hanum.simple.board.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceImplTest {

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void setAccount() {
        Account account = new Account();
        account.setUsername("hanum");
        account.setPassword("1234");

        Account savedAccount = accountRepository.save(account);

        System.out.println(savedAccount.toString());
    }

    @Test
    public void getAccountById() {
        Account account = new Account();
        account.setUsername("hanum");
        account.setPassword("1234");

        Account savedAccount = accountRepository.save(account);

        System.out.println(savedAccount.toString());

        Account getAccount = accountRepository.findById(savedAccount.getId()).get();
        System.out.println(getAccount.toString());
    }

    @Test
    public void existAccount() {
    }
}
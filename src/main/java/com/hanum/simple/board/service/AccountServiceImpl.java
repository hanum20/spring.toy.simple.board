package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Account;
import com.hanum.simple.board.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public void setAccount(Account account) throws Exception {
        repository.save(account);
    }

    @Override
    public Account getAccountById(Long id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public boolean existAccount(Account account) throws Exception {
        return repository.countByAccount(account) > 0 ? true : false ;
    }
}

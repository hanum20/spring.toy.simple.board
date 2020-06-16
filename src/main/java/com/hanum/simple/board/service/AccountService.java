package com.hanum.simple.board.service;

import com.hanum.simple.board.domain.Account;

public interface AccountService {
    public void setAccount(Account account) throws Exception;
    public Account getAccountById(Long id) throws Exception;
    public boolean existAccount(Account account) throws Exception;
}

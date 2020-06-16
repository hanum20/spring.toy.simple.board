package com.hanum.simple.board.repository;

import com.hanum.simple.board.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public Long countById (Account account);
}

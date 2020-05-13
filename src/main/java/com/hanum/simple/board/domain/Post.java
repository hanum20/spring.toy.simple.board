package com.hanum.simple.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter @ToString
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    private Account account;
}

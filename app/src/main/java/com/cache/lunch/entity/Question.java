package com.cache.lunch.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "question")
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "content")
    private String content;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Option> options = new HashSet<>();

}

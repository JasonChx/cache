package com.cache.lunch.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "option")
@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "content")
    private String content;

//    @ManyToOne
//    @JoinColumn(foreignKey = @ForeignKey(name = "fk_option_question"))
//    private Question question;
}

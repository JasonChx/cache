package com.cache.lunch.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "answer")
@Data
@NoArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "question_id")
    private long questionId;

    @Column(name = "option_id")
    private long optionId;

    @Column(name = "date")
    private LocalDateTime date;

    public Answer(long questionId, long optionId, LocalDateTime date) {
        this.questionId = questionId;
        this.optionId = optionId;
        this.date = date;
    }
}

package com.cache.lunch.service.impl;

import com.cache.lunch.entity.Answer;
import com.cache.lunch.repository.AnswerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepo answerRepo;

    @Override
    public Answer save(Answer answer){
        return answerRepo.save(answer);
    }
}

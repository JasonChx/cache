package com.cache.lunch.service.impl;

import com.cache.lunch.entity.Question;
import com.cache.lunch.repository.QuestionRepo;
import com.cache.lunch.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public List<Question> findAll(){
        return questionRepo.findAll();
    }
}

package com.cache.lunch.controller;

import com.cache.lunch.entity.Answer;
import com.cache.lunch.entity.Option;
import com.cache.lunch.entity.Question;
import com.cache.lunch.service.QuestionService;
import com.cache.lunch.service.impl.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class SurveyController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @GetMapping("/findAll")
    public List<Question> findAll(){
        return questionService.findAll();
    }

    @GetMapping("/answer")
    public void answer(@RequestParam(value = "questionId") long questionId, @RequestParam(value = "optionId") long optionId){
        Answer answer = new Answer();
        answer.setDate(LocalDateTime.now());
        answer.setQuestionId(questionId);
        answer.setOptionId(optionId);
        answerService.save(answer);
    }
}

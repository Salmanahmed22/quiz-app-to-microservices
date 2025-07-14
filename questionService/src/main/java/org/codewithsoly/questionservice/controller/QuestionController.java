package org.codewithsoly.questionservice.controller;


import org.codewithsoly.questionservice.model.Question;
import org.codewithsoly.questionservice.model.QuestionWrapper;
import org.codewithsoly.questionservice.model.Response;
import org.codewithsoly.questionservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }

    @GetMapping("generateQuizQuestions")
    public ResponseEntity<List<Integer>> generateQuizQuestions(
            @RequestParam int numOfQuestions, String category){
        return questionService.generateQuizQuestions(numOfQuestions, category);
    }

    @PostMapping("getQuizQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@RequestBody List<Integer> questionIds){
        return questionService.getQuizQuestions(questionIds);
    }

    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
    }

}

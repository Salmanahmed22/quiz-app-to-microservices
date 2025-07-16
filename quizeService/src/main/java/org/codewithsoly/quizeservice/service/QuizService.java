package org.codewithsoly.quizeservice.service;


import org.codewithsoly.quizeservice.feign.QuizInterface;
import org.codewithsoly.quizeservice.model.QuestionWrapper;
import org.codewithsoly.quizeservice.model.Quiz;
import org.codewithsoly.quizeservice.model.Response;
import org.codewithsoly.quizeservice.repo.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuizInterface quizInterface;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Integer> questionIds = quizInterface.generateQuizQuestions(numQ,category).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionsIds(questionIds);
        quizRepo.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Integer> questionsids = quiz.get().getQuestionsIds();

        List<QuestionWrapper> questionsForUser = quizInterface.getQuizQuestions(questionsids).getBody();

        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);

    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        int score = quizInterface.getScore(responses).getBody();
        return new ResponseEntity<>(score, HttpStatus.OK);
    }
}

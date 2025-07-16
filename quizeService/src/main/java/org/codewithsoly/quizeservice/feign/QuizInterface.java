package org.codewithsoly.quizeservice.feign;

import org.codewithsoly.quizeservice.model.QuestionWrapper;
import org.codewithsoly.quizeservice.model.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("QUESTION-SERVICE")
public interface QuizInterface {
    @GetMapping("question/generateQuizQuestions")
    public ResponseEntity<List<Integer>> generateQuizQuestions(
            @RequestParam int numOfQuestions,@RequestParam String category);

    @PostMapping("question/getQuizQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@RequestBody List<Integer> questionIds);

    @PostMapping("question/getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses);
}

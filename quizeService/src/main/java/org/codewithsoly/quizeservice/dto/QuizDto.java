package org.codewithsoly.quizeservice.dto;

import lombok.Data;

@Data
public class QuizDto {
    private String category;
    private String title;
    private int numberOfQuestions;
}

package org.codewithsoly.quizeservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuizDto {
    private String category;
    private String title;
    private int numberOfQuestions;

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}

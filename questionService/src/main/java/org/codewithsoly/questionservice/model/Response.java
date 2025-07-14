package org.codewithsoly.questionservice.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer questionId;
    private String response;

    public Integer getQuestionId() {
        return questionId;
    }

    public String getResponse() {
        return response;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

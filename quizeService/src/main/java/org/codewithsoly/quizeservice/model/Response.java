package org.codewithsoly.quizeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

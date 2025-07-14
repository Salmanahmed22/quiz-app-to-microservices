package org.codewithsoly.questionservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Getter
@Setter
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

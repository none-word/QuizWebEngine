package com.example.quizwebengine.payload.request;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequest {

    private String question;
    private List<AnswerRequest> answer;

}

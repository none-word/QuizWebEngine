package com.example.quizwebengine.repository;

import com.example.quizwebengine.model.quiz.Question;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    Optional<List<Question>> findAllByQuizId(Long quizId);

}

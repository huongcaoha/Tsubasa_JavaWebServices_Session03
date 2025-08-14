package com.example.session03.repository;

import com.example.session03.model.entity.Answer;
import com.example.session03.model.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    @Query("select a from Answer a where a.question.id = :id")
    List<Answer> findAllByQuestionId(@Param("id") long id);
}

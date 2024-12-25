package com.abhishek.quizapp.dao;

import com.abhishek.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDoa extends JpaRepository<Quiz,Integer> {

}

package com.abhishek.quizapp.controller;

import com.abhishek.quizapp.model.Question;
import com.abhishek.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }


    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        List<Question> questions = questionService.getQuestionsByCategory(category);
        return questions;
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody  Question question){
        return questionService.addQuestion(question);
    }

    @PutMapping("update")
    public String updateQuestion(@RequestBody  Question question){
        return questionService.updateQuestion(question);
    }

    @DeleteMapping("delete")
    public String deleteQuestion(@RequestBody Question question){
        return questionService.deleteQuestion(question);
    }

}

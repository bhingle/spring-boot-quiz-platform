package com.abhishek.quizapp.service;

import com.abhishek.quizapp.dao.QuestionDao;
import com.abhishek.quizapp.dao.QuizDoa;
import com.abhishek.quizapp.model.Question;
import com.abhishek.quizapp.model.QuestionWrapper;
import com.abhishek.quizapp.model.Quiz;
import com.abhishek.quizapp.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuestionDao questionDao;

    @Autowired
    QuizDoa quizDoa;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionByCategory(category,numQ);
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDoa.save(quiz);
        return  new ResponseEntity<>("Success", HttpStatus.OK);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
        Optional<Quiz> quiz = quizDoa.findById(id);
        List<Question> questions = quiz.get().getQuestions();
        List<QuestionWrapper> questionWrappers = new ArrayList<>();
        for (Question q : questions) {
            QuestionWrapper questionWrapper = new QuestionWrapper(q.getId(), q.getQuestion_title(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
            questionWrappers.add(questionWrapper);
        }
        return new ResponseEntity<>(questionWrappers, HttpStatus.OK);
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
        Quiz quiz = quizDoa.findById(id).get();
        List<Question> questions = quiz.getQuestions();
        int right = 0;
        int i =0;
        for(Response response :responses){
            System.out.println(response.getResponse());
            System.out.println(questions.get(i).getRight_answer());
            for(Question q : questions){
                if(q.getId().equals(response.getId()))
                    if(q.getRight_answer().equals(response.getResponse()))
                        right++;
            }
            i++;

        }
        return new ResponseEntity<>(right,HttpStatus.OK);

    }
}

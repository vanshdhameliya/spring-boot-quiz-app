package vwc.quizapp.service;

import org.springframework.stereotype.Service;
import vwc.quizapp.repository.QuestionDao;
import vwc.quizapp.entity.Question;

import java.util.List;

@Service
public class QuestionService {

    QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public List<Question> getAllQuestions() {

        return questionDao.findAll();
    }

    public List<Question> getAllQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }
}

package vwc.quizapp.service;

import org.springframework.stereotype.Service;
import vwc.quizapp.entity.Question;
import vwc.quizapp.repository.QuestionDao;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionDao questionDao;

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
        return "Question Added Successfully";
    }

    public String deleteById(Integer id) {

        // Check whether the question exists or not
        if (!questionDao.existsById(id)) {
            return "Question with ID " + id + " not found";
        }

        try {
            questionDao.deleteById(id);
            return "Question Deleted Successfully";
        } catch (Exception e) {
            e.printStackTrace(); // Prints the actual error in console
            return "Error while deleting: " + e.getMessage();
        }
    }
}
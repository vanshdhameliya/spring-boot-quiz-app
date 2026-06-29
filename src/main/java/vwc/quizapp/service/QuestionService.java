package vwc.quizapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import vwc.quizapp.entity.Question;
import vwc.quizapp.repository.QuestionDao;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Question>> getAllQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {

        try {
            if (questionDao.existsByQuestionTitle(question.getQuestionTitle())) {
                return new ResponseEntity<>("This Question Already Exists", HttpStatus.CONFLICT);
            }

            questionDao.save(question);
            return new ResponseEntity<>("Question Added Successfully", HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>("Error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<String> deleteById(Integer id) {

        if (!questionDao.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Question with ID " + id + " not found");
        }

        try {
            questionDao.deleteById(id);
            return ResponseEntity.ok("Question Deleted Successfully");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while deleting: " + e.getMessage());
        }
    }
}
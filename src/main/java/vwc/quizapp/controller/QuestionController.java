package vwc.quizapp.controller;

import org.springframework.web.bind.annotation.*;
import vwc.quizapp.entity.Question;
import vwc.quizapp.service.QuestionService;

import java.util.List;

@RestController
    @RequestMapping("question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("allquestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category) {

        return questionService.getAllQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}

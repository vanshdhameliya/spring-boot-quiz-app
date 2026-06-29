package vwc.quizapp.repository;

import org.hibernate.boot.models.JpaAnnotations;
import org.springframework.data.jpa.repository.JpaRepository;
import vwc.quizapp.entity.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {


}

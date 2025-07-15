package org.codewithsoly.quizeservice.repo;

import org.codewithsoly.quizeservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz,Integer> {
}

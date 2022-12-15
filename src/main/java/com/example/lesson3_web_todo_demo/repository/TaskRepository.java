package com.example.lesson3_web_todo_demo.repository;

import com.example.lesson3_web_todo_demo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

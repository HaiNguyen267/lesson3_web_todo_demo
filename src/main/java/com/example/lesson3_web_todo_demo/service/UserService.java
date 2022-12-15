package com.example.lesson3_web_todo_demo.service;

import com.example.lesson3_web_todo_demo.dto.request.*;
import com.example.lesson3_web_todo_demo.entity.Task;
import com.example.lesson3_web_todo_demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@Service
public class UserService {



    @Autowired
    private TaskRepository taskRepository;


    public void addTask(AddTaskRequest addTaskRequest) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
        String createdAt = formatter.format(new Date(new Date().getTime()));
        Task task = Task.builder()
                .description(addTaskRequest.getDescription())
                .createdAt(createdAt)
                .isDone(false)
                .build();

        taskRepository.save(task);

    }


    public void deleteTask(long taskId) {
        taskRepository.deleteById(taskId);
    }

    public void doneTask(long taskId) {
        Task task = taskRepository.findById(taskId).get();
        task.setDone(true);
        taskRepository.save(task);

    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}

package com.example.lesson3_web_todo_demo.controller;

import com.example.lesson3_web_todo_demo.dto.request.*;
import com.example.lesson3_web_todo_demo.entity.Task;
import com.example.lesson3_web_todo_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
//
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String home(Model model) {
        List<Task> tasks = userService.getAllTasks();
        model.addAttribute("tasks", tasks);
        System.out.println(tasks);
        return "home";
    }



    @PostMapping("/addTask")
    public String addTask(@ModelAttribute AddTaskRequest addTaskRequest) {
        userService.addTask(addTaskRequest);

        return "redirect:/";
    }

    @GetMapping("/doneTask/{taskId}")
    public String doneTask(@PathVariable long taskId) {
        userService.doneTask(taskId);

        return "redirect:/";
    }

    @GetMapping("/deleteTask/{taskId}")
    public String deleteTask(@PathVariable long taskId) {
        userService.deleteTask(taskId);

        return "redirect:/";
    }
}

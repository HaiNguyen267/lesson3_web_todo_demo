package com.example.lesson3_web_todo_demo.dto.request;

import com.example.lesson3_web_todo_demo.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddTaskRequest {
    private String description;
}

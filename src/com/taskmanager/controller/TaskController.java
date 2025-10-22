package com.taskmanager.controller;

import com.taskmanager.model.Task;
import com.taskmanager.service.TaskService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class TaskController {
    private TaskService service = new TaskService();

    public Task createTask(String title, String description, LocalDateTime dueDate) {
        return service.addTask(title, description, dueDate);
    }

    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    public Optional<Task> updateTask(int id, String title, String description, boolean completed) {
        return service.updateTask(id, title, description, completed);
    }

    public boolean deleteTask(int id) {
        return service.deleteTask(id);
    }
}

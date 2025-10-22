package com.taskmanager.service;

import com.taskmanager.model.Task;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public Task addTask(String title, String description, LocalDateTime dueDate) {
        Task task = new Task(nextId++, title, description, dueDate);
        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Optional<Task> updateTask(int id, String title, String description, boolean completed) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(completed);
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }
}

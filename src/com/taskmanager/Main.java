package com.taskmanager;

import com.taskmanager.controller.TaskController;
import com.taskmanager.model.Task;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TaskController controller = new TaskController();

        // Add tasks
        controller.createTask("Buy groceries", "Milk, Bread, Eggs", LocalDateTime.now().plusDays(1));
        controller.createTask("Finish project", "Complete the CI/CD demo", LocalDateTime.now().plusDays(2));

        // Display all tasks
        System.out.println("All Tasks:");
        for (Task t : controller.getTasks()) {
            System.out.println(t);
        }

        // Update a task
        controller.updateTask(1, "Buy groceries", "Milk, Bread, Eggs, Cheese", true);

        // Delete a task
        controller.deleteTask(2);

        System.out.println("\nAfter Update & Delete:");
        for (Task t : controller.getTasks()) {
            System.out.println(t);
        }
    }
}

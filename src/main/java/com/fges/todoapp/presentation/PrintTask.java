package com.fges.todoapp.presentation;

import com.fges.todoapp.taskmanager.Task;

// Class that manages the print of a task
public class PrintTask {
    public void printTask(Task task){
        String status = task.getDone()? "- Done: " : "- ";
        System.out.println(status + task.getName());
    }
}

package com.fges.todoapp.presentation;

import com.fges.todoapp.taskmanager.Task;

public class PrintTask {
    public void printTask(Task task){
        String status = task.getDone()? "- Done: " : "- ";
        System.out.println(status + task.getName());
    }
}

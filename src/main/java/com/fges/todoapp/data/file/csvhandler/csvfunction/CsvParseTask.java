package com.fges.todoapp.data.file.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;



// Class that serves to return a task from a string (a line) from a CSV file

public class CsvParseTask {
    private static final String SEPARATOR = "\\|";

    public  Task parseTask(String taskString) {
        String[] parts = taskString.split(SEPARATOR);
        if (parts.length != 2) {
            throw new IllegalArgumentException("Task string format is incorrect.");
        }
        String name = parts[0];
        boolean done = Boolean.parseBoolean(parts[1]);
        return new Task(name, done);
    }
}

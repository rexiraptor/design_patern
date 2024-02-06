package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;

public class CsvParseTask {
    public static Task parseTask(String taskString) {
        String[] parts = taskString.split("\\|");
        String name = parts[0];
        boolean done = Boolean.parseBoolean(parts[1]);
        return new Task(name, done);
    }
}

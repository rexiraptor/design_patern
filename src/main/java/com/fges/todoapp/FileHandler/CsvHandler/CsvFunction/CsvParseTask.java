package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

import com.fges.todoapp.Task;

public class CsvParseTask {
    public static Task parseTask(String taskString) {
        String[] parts = taskString.split("\\|");
        String name = parts[0];
        //boolean done = Boolean.parseBoolean(parts[1]);
        return new Task(name);
    }
}

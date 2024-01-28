package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

import com.fges.todoapp.Task;

import java.util.Arrays;
import java.util.List;

public class CsvList {
    public static void list(String fileContent) {
        List<Task> tasks = Arrays.stream(fileContent.split("\n"))
                .map(CsvParseTask::parseTask)
                .toList();

        tasks.forEach(task -> System.out.println("- " + task.getName()));
    }
}

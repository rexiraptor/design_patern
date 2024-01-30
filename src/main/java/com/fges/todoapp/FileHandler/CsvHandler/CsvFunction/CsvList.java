package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

import com.fges.todoapp.TaskManager.Task;

import java.util.Arrays;
import java.util.List;

public class CsvList {
    public static void list(String fileContent) {

        List<Task> tasks = Arrays.stream(fileContent.split("\n"))
                .map(CsvParseTask::parseTask)
                .toList();

        tasks.forEach(task ->{
            String status = task.getDone()? "Done: " : " - ";
            System.out.println(status + task.getName());
        });
    }
}

package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;

import java.util.Arrays;
import java.util.List;

public class CsvList {
// Function that serves to return a list of tasks from all the tasks present in a CSV file
    public List<Task> list(String fileContent) {
        CsvParseTask csvParseTask = new CsvParseTask();
        return Arrays.stream(fileContent.split("\n"))
                .map(csvParseTask::parseTask)
                .toList();


    }

}

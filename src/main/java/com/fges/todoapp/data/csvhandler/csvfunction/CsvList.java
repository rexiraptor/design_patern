package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;

import java.util.Arrays;
import java.util.List;

public class CsvList {
    public static List<Task> list(String fileContent) {

        return Arrays.stream(fileContent.split("\n"))
                .map(CsvParseTask::parseTask)
                .toList();


    }

}

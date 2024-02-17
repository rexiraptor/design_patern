package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;

import java.util.Arrays;
import java.util.List;

public class CsvList {
    //fonction qui sert a retrouner une liste de task de toute les tache présente dans un fichier csv
    public static List<Task> list(String fileContent) {

        return Arrays.stream(fileContent.split("\n"))
                .map(CsvParseTask::parseTask)
                .toList();


    }

}

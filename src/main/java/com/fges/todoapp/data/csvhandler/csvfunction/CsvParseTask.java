package com.fges.todoapp.data.csvhandler.csvfunction;

import com.fges.todoapp.taskmanager.Task;

//class qui sert a renvoyer une tache a partir d'un string (une ligne) d'un fichier csv
public class CsvParseTask {
    public static Task parseTask(String taskString) {
        String[] parts = taskString.split("\\|");
        String name = parts[0];
        boolean done = Boolean.parseBoolean(parts[1]);
        return new Task(name, done);
    }
}

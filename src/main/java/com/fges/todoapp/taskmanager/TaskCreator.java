package com.fges.todoapp.taskmanager;


import com.fges.todoapp.taskmanager.taskvariable.GetTodoName;
import com.fges.todoapp.taskmanager.taskvariable.GetIsDone;
import org.apache.commons.cli.CommandLine;

public class TaskCreator {
    public Task creator(CommandLine cmd) {


        try {
            String name = GetTodoName.todoName(cmd);
            Boolean done = GetIsDone.getValue(cmd);

            return new Task(name, done);

        } catch (Exception e) {
            throw new IllegalArgumentException("Problème avec la création de la tache.");
        }
    }
}

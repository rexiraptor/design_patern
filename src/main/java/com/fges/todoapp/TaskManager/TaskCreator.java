package com.fges.todoapp.TaskManager;


import com.fges.todoapp.TaskManager.TaskVariable.GetTodoName;
import com.fges.todoapp.TaskManager.TaskVariable.IsDone;
import org.apache.commons.cli.CommandLine;

public class TaskCreator {
    public Task creator(CommandLine cmd) {


        try {
            String name = GetTodoName.todoName(cmd);
            Boolean done = IsDone.isDone(cmd);

            return new Task(name, done);

        } catch (Exception e) {
            throw new IllegalArgumentException("Problème avec la création de la tache.");
        }
    }
}

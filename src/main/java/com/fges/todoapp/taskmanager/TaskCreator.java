package com.fges.todoapp.taskmanager;


import com.fges.todoapp.presentation.settingsprovider.GetTodoName;
import com.fges.todoapp.presentation.settingsprovider.GetOptDone;
import org.apache.commons.cli.CommandLine;

// Class creating a task from the command line (allows for not changing the task creation in
// all file handlers if one wants to potentially change their format or add options, such as a creation date for example)
public class TaskCreator {
    public Task creator(CommandLine cmd) {


        try {
            String name = GetTodoName.todoName(cmd);
            Boolean done = GetOptDone.getValue(cmd);

            return new Task(name, done);

        } catch (Exception e) {
            throw new IllegalArgumentException("Problème avec la création de la tache.");
        }
    }
}

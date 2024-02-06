package com.fges.todoapp.logic;

import com.fges.todoapp.presentation.PrintTask;
import com.fges.todoapp.taskmanager.Task;
import com.fges.todoapp.taskmanager.taskvariable.GetIsDone;
import org.apache.commons.cli.CommandLine;

import java.util.List;
public class PrintManager {
    public void printList(List<Task> tasks, CommandLine cmd){

        if(GetIsDone.getValue(cmd)){
            tasks.forEach(task ->{
              if (task.getDone()) {
                  PrintTask printTask = new PrintTask();
                  printTask.printTask(task);
              }
            });
        } else {
            tasks.forEach(task ->{
                PrintTask printTask = new PrintTask();
                printTask.printTask(task);
            });
        }
    }
}


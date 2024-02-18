package com.fges.todoapp.presentation;

import com.fges.todoapp.taskmanager.Task;

import java.util.List;

// Class that manages the logic of printing tasks (here based on the 'optdone' parameter)
public class PrintManager {
    public void printList(List<Task> tasks, Boolean optdone){

        if(optdone){
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


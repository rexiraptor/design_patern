package com.fges.todoapp.presentation;

import com.fges.todoapp.taskmanager.Task;

import java.util.List;

//class qui gere la logique du print des tasks(ici en fonction du paramettre optdone)
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


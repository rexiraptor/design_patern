package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFilePath;
import com.fges.todoapp.taskmanager.Task;
import com.fges.todoapp.taskmanager.TaskCreator;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsertAction implements FileCommandAction {
    @Override
    public void execute(FileHandlerBase fileHandler, CommandLine cmd) throws IOException {
        List<Task> tasks = new ArrayList<>();
        TaskCreator taskCreator = new TaskCreator();
        tasks.add(taskCreator.creator(cmd));
        fileHandler.insert( tasks, CommandGetFilePath.getFilePath(cmd));
    }
}
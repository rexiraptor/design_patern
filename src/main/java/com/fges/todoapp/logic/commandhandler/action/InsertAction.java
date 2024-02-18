package com.fges.todoapp.logic.commandhandler.action;

import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFilePath;
import com.fges.todoapp.taskmanager.Task;
import com.fges.todoapp.taskmanager.TaskCreator;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Class representing which action (function) to perform when the user uses the insert command
public class InsertAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetFileName.getFileName(cmd));

        List<Task> tasks = new ArrayList<>();
        TaskCreator taskCreator = new TaskCreator();
        tasks.add(taskCreator.creator(cmd));
        fileHandler.insert( tasks, CommandGetFilePath.getFilePath(cmd));
    }
}
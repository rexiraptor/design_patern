package com.fges.todoapp.logic.commandhandler.action;

import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;

import com.fges.todoapp.presentation.settingsprovider.CommandGetOpt;
import com.fges.todoapp.taskmanager.Task;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.List;
// Class representing what action to take when the user uses the 'migration' command.

public class MigrationAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetOpt.getOptionValue(cmd, "s"));
        FileHandlerBase migratorHandler = fileHandlerFactory.createFileHandler(CommandGetOpt.getOptionValue(cmd, "o"));

        List<Task> tasks = fileHandler.list(CommandGetFileContent.getFileContent(cmd));
        migratorHandler.insert(tasks, CommandGetOpt.getOptionValue(cmd, "o"));


    }
}

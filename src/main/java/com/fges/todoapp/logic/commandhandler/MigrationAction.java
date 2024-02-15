package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.FileHandlerFactory;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetMigrationFileName;
import com.fges.todoapp.presentation.settingsprovider.CommandGetMigrationFilePath;
import com.fges.todoapp.taskmanager.Task;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.List;

public class MigrationAction implements FileCommandAction{
    @Override
    public void execute(FileHandlerBase fileHandler, CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();

        List<Task> tasks = fileHandler.list(CommandGetFileContent.getFileContent(cmd));
        FileHandlerBase migratorHandler = fileHandlerFactory.createFileHandler(CommandGetMigrationFileName.getFileName(cmd));
        migratorHandler.insert(tasks, CommandGetMigrationFilePath.getFilePath(cmd));




        //
        // fileHandler.migration(cmd);
    }
}

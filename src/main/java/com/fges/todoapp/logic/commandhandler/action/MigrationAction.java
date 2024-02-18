package com.fges.todoapp.logic.commandhandler.action;

import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import com.fges.todoapp.presentation.settingsprovider.CommandGetMigrationFileName;
import com.fges.todoapp.presentation.settingsprovider.CommandGetMigrationFilePath;
import com.fges.todoapp.taskmanager.Task;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.List;
//class représentant quel action(fonction) effectuer lorsque l'utilisateur utilise la command migration

public class MigrationAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetFileName.getFileName(cmd));
        FileHandlerBase migratorHandler = fileHandlerFactory.createFileHandler(CommandGetMigrationFileName.getFileName(cmd));

        List<Task> tasks = fileHandler.list(CommandGetFileContent.getFileContent(cmd));
        migratorHandler.insert(tasks, CommandGetMigrationFilePath.getFilePath(cmd));


    }
}

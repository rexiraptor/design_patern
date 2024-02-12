// CommandExecutor.java
package com.fges.todoapp.logic;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.FileHandlerFactory;
import com.fges.todoapp.logic.commandhandler.CommandHandlerMap;
import com.fges.todoapp.logic.commandhandler.FileCommandAction;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;

public class CommandExecutor {

    private final Map<String, FileCommandAction> commandActions;

    public CommandExecutor() {
        this.commandActions = CommandHandlerMap.initializeCommandActions();
    }

    public void executeCommand(String fileName, String command, String fileContent, Path filePath, CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        Optional<FileHandlerBase> fileHandlerOptional = fileHandlerFactory.createFileHandler(fileName);

        if (fileHandlerOptional.isPresent()) {
            FileHandlerBase fileHandler = fileHandlerOptional.get();

            if (commandActions.containsKey(command)) {
                commandActions.get(command).execute(fileHandler, fileName, fileContent, filePath, cmd);
            } else {
                throw new UnsupportedOperationException("Unsupported command: " + command);
            }
        } else {
            throw new UnsupportedOperationException("Unsupported file type for: " + fileName);
        }
    }
}

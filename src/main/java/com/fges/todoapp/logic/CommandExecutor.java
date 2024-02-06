package com.fges.todoapp.logic;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.FileHandlerFactory;
import com.fges.todoapp.presentation.settingsprovider.CommandGetCommand;
import com.fges.todoapp.presentation.settingsprovider.CommandIsList;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

public class CommandExecutor {

    public void executeCommand(String fileName, String command, String fileContent, Path filePath , CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        Optional<FileHandlerBase> fileHandlerOptional = fileHandlerFactory.createFileHandler(fileName);

        if (fileHandlerOptional.isPresent()) {
            FileHandlerBase fileHandler = fileHandlerOptional.get();

            if (CommandGetCommand.CommandIsInsert.isInsert(command)) {
                fileHandler.insert(fileName, fileContent, filePath, cmd);
            } else if (CommandIsList.isList(command)) {
                fileHandler.list(fileContent, cmd);
            } else {
                throw new UnsupportedOperationException("Unsupported command type");
            }
        } else {
            throw new UnsupportedOperationException("Unsupported file type");
        }
    }
}


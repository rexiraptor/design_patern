package com.fges.todoapp.CommandsHandler;

import com.fges.todoapp.FileHandler.FileHandlerBase;
import com.fges.todoapp.FileHandler.FileHandlerFactory;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class CommandExecutor {

    public static void executeCommand(String fileName, String command, List<String> positionalArgs, String fileContent, Path filePath) throws IOException {
        Optional<FileHandlerBase> fileHandlerOptional = FileHandlerFactory.createFileHandler(fileName);

        if (fileHandlerOptional.isPresent()) {
            FileHandlerBase fileHandler = fileHandlerOptional.get();

            if (CommandIsInsert.isInsert(command)) {
                fileHandler.insert(positionalArgs, fileName, fileContent, filePath);
            } else if (CommandIsList.isList(command)) {
                fileHandler.list(fileContent);
            } else {
                throw new UnsupportedOperationException("Unsupported command type");
            }
        } else {
            throw new UnsupportedOperationException("Unsupported file type");
        }
    }
}


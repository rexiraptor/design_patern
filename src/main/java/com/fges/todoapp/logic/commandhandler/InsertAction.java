package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
import java.nio.file.Path;

public class InsertAction implements FileCommandAction {
    @Override
    public void execute(FileHandlerBase fileHandler, String fileName, String fileContent, Path filePath, CommandLine cmd) throws IOException {
        fileHandler.insert(fileName, fileContent, filePath, cmd);
    }
}
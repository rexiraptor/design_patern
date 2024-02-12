package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
import java.nio.file.Path;

@FunctionalInterface
public interface FileCommandAction {
    void execute(FileHandlerBase fileHandler, String fileName, String fileContent, Path filePath, CommandLine cmd) throws IOException;
}

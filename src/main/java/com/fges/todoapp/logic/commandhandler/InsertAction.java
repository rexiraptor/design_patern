package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;

public class InsertAction implements FileCommandAction {
    @Override
    public void execute(FileHandlerBase fileHandler, CommandLine cmd) throws IOException {
        fileHandler.insert(cmd);
    }
}
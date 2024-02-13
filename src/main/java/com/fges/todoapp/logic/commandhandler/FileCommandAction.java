package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;

@FunctionalInterface
public interface FileCommandAction {
    void execute(FileHandlerBase fileHandler,  CommandLine cmd) throws IOException;
}

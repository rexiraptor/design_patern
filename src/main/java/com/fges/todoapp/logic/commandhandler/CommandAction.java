package com.fges.todoapp.logic.commandhandler;

import org.apache.commons.cli.CommandLine;
import java.io.IOException;

@FunctionalInterface
public interface CommandAction {
    void execute(CommandLine cmd) throws IOException;
}

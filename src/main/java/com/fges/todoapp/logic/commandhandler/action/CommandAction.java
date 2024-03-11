package com.fges.todoapp.logic.commandhandler.action;

import org.apache.commons.cli.CommandLine;
import java.io.IOException;

// Interface representing the structure of an action/command to be performed

@FunctionalInterface
public interface CommandAction {
    void execute(CommandLine cmd) throws IOException, InterruptedException;
}

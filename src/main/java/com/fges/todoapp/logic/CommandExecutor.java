// CommandExecutor.java
package com.fges.todoapp.logic;

import com.fges.todoapp.logic.commandhandler.CommandHandlerMap;
import com.fges.todoapp.logic.commandhandler.action.CommandAction;

import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.Map;


// Executes an action (CommandAction) if it is supported, otherwise returns an error
public class CommandExecutor {

    private final Map<String, CommandAction> commandActions;

    public CommandExecutor() {
        this.commandActions = CommandHandlerMap.initializeCommandActions();
    }

    public void executeCommand( String actionSource, CommandLine cmd) throws IOException, InterruptedException {

            if (commandActions.containsKey(actionSource)) {
                commandActions.get(actionSource).execute(cmd);

        } else {
            throw new UnsupportedOperationException("Unsupported command type for: " + actionSource);
        }
    }
}

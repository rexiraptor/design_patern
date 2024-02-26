// CommandExecutor.java
package com.fges.todoapp.logic;

import com.fges.todoapp.logic.commandhandler.CommandHandlerMap;
import com.fges.todoapp.logic.commandhandler.action.CommandAction;

import com.fges.todoapp.presentation.settingsprovider.CommandGetOpt;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.Map;


// Executes an action (CommandAction) if it is supported, otherwise returns an error
public class CommandExecutor {

    private final Map<String, CommandAction> commandActions;

    public CommandExecutor() {
        this.commandActions = CommandHandlerMap.initializeCommandActions();
    }

    public void executeCommand( String command, CommandLine cmd) throws IOException {

            if (commandActions.containsKey(command)) {
                commandActions.get(command).execute(cmd);

        } else {
            throw new UnsupportedOperationException("Unsupported command type for: " + CommandGetOpt.getOptionValue(cmd, "s"));
        }
    }
}

// CommandExecutor.java
package com.fges.todoapp.logic;

import com.fges.todoapp.logic.commandhandler.CommandHandlerMap;
import com.fges.todoapp.logic.commandhandler.CommandAction;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.Map;


// execute une action(CommandAction) si elle est supporté, sinon renvoie une erreur
public class CommandExecutor {

    private final Map<String, CommandAction> commandActions;

    public CommandExecutor() {
        this.commandActions = CommandHandlerMap.initializeCommandActions();
    }

    public void executeCommand( String command, CommandLine cmd) throws IOException {

            if (commandActions.containsKey(command)) {
                commandActions.get(command).execute(cmd);

        } else {
            throw new UnsupportedOperationException("Unsupported file type for: " + CommandGetFileName.getFileName(cmd));
        }
    }
}

package com.fges.todoapp.TaskManager.TaskVariable;

import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandCheckParams;
import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandGetCommand;
import org.apache.commons.cli.CommandLine;

import java.util.List;

public class GetTodoName {

    public static String todoName(CommandLine cmd){
        List<String> positionalArgs = CommandGetCommand.getCommand(cmd);

        if (CommandCheckParams.checkparams(positionalArgs)) {
            return positionalArgs.get(1);
        }else{
            throw new IllegalArgumentException("missing todo name.");
        }
    }
}

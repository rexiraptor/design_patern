package com.fges.todoapp.taskmanager.taskvariable;

import com.fges.todoapp.presentation.settingsprovider.CommandCheckToDoName;
import com.fges.todoapp.presentation.settingsprovider.CommandGetCommand;
import org.apache.commons.cli.CommandLine;

import java.util.List;

public class GetTodoName {

    public static String todoName(CommandLine cmd){
        List<String> positionalArgs = CommandGetCommand.getCommand(cmd);

        if (CommandCheckToDoName.checkparams(positionalArgs)) {
            return positionalArgs.get(1);
        }else{
            throw new IllegalArgumentException("missing todo name.");
        }
    }
}

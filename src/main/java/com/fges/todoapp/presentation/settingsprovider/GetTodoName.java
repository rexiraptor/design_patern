package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.util.List;
//class qui renvoie un le nom du todoname de la liste de commande
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

package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.util.List;

//class qui renvoie la command demandé par l'utilisateur
public class CommandGetCommand {

    public static  List<String> getCommand(CommandLine cmd){
        List<String> positionalArgs = cmd.getArgList();
        if (positionalArgs.isEmpty()) {
            throw new UnsupportedOperationException("Missing Command");
        }
        return positionalArgs;
    }

}

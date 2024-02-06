package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.util.List;

public class CommandGetCommand {

    public static  List<String> getCommand(CommandLine cmd){
        List<String> positionalArgs = cmd.getArgList();
        if (positionalArgs.isEmpty()) {
            throw new UnsupportedOperationException("Missing Command");
        }
        return positionalArgs;
    }

    public static class CommandIsInsert {
        public static boolean isInsert(String command){
            return command.equals("insert");
        }

    }
}

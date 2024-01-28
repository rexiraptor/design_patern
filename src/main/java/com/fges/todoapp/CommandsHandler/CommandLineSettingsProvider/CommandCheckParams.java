package com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider;

import java.util.List;

public class CommandCheckParams {
    public static boolean checkparams(List<String> positionalArgs){
        if (positionalArgs.size() < 2) {
            System.err.println("Missing TODO name");
            return false;
        }else {
            return true;
        }
    }
}

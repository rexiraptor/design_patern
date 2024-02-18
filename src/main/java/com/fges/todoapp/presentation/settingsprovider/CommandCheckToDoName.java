package com.fges.todoapp.presentation.settingsprovider;

import java.util.List;

// Class that checks if the todoname is indeed present in the command line
public class CommandCheckToDoName {
    public static boolean checkparams(List<String> positionalArgs){
        if (positionalArgs.size() < 2) {
            System.err.println("Missing TODO name");
            return false;
        }else {
            return true;
        }
    }
}

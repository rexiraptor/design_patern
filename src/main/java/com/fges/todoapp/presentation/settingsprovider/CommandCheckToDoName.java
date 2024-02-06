package com.fges.todoapp.presentation.settingsprovider;

import java.util.List;

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

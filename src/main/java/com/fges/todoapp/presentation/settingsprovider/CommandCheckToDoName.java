package com.fges.todoapp.presentation.settingsprovider;

import java.util.List;

//class qui vérifie si le todoname n'est est bien présent dans la ligne de command
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

package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;


//class qui renvoie true si il'y a l'option --d sur la ligne de command
public class GetOptDone {
    public static Boolean getValue(CommandLine cmd){
        return cmd.hasOption("done");
    }
}

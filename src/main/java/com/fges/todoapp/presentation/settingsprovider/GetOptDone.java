package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;


// Class that returns true if the --d option is on the command line

public class GetOptDone {
    public static Boolean getValue(CommandLine cmd){
        return cmd.hasOption("done");
    }
}

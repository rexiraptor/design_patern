package com.fges.todoapp.taskmanager.taskvariable;

import org.apache.commons.cli.CommandLine;

public class GetIsDone {
    public static Boolean getValue(CommandLine cmd){
        return cmd.hasOption("done");
    }
}

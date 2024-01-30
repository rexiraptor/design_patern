package com.fges.todoapp.TaskManager.TaskVariable;

import org.apache.commons.cli.CommandLine;

public class IsDone {
    public static Boolean isDone(CommandLine cmd){
        return cmd.hasOption("done");
    }
}

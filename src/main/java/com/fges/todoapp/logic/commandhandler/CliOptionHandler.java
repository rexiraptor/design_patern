package com.fges.todoapp.logic.commandhandler;

import org.apache.commons.cli.Options;

public class CliOptionHandler {


    public Options cliOptionHandler(){

        Options cliOptions= new Options();

        cliOptions.addOption("d","done", false, "Indique si la tâche est terminée");

        cliOptions.addRequiredOption("s", "source", true, "File containing the todos");

        return cliOptions;
    }
}

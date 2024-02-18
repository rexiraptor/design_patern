package com.fges.todoapp.logic.commandhandler;

import org.apache.commons.cli.Options;

public class CliOptionHandler {

// Class grouping all the options that we want to be able to add on the command line
    public Options cliOptionHandler(){

        Options cliOptions= new Options();

        cliOptions.addOption("d","done", false, "Indique si la tâche est terminée");

        cliOptions.addRequiredOption("s", "source", true, "File containing the todos");

        cliOptions.addOption("o","output", true, "permet de migrer un type de fichier vers un autre");

        return cliOptions;
    }
}

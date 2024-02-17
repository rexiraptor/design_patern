package com.fges.todoapp.logic.commandhandler;

import org.apache.commons.cli.Options;

public class CliOptionHandler {

    //class regroupant toute les options que l'on veut pouvoir ajouter sur la ligne de commande

    public Options cliOptionHandler(){

        Options cliOptions= new Options();

        cliOptions.addOption("d","done", false, "Indique si la tâche est terminée");

        cliOptions.addRequiredOption("s", "source", true, "File containing the todos");

        cliOptions.addOption("m","migration", true, "permet de migrer un type de fichier vers un autre");

        return cliOptions;
    }
}

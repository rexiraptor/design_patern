package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

//class qui renvoie le nom du fichier que l'on veut migrer (opt -m)
public class CommandGetMigrationFileName {
    public static String getFileName(CommandLine cmd) {
        return cmd.getOptionValue("o");
    }

}

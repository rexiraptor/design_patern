package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

//class qui renvoie le nom d'un fichier
public class CommandGetFileName {
    public static String getFileName(CommandLine cmd) {
        return cmd.getOptionValue("s");
    }
}

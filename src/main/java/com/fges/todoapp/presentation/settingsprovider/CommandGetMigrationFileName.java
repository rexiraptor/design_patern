package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

// Class that returns the extension of the file we want to migrate
public class CommandGetMigrationFileName {
    public static String getFileName(CommandLine cmd) {
        return cmd.getOptionValue("o");
    }

}

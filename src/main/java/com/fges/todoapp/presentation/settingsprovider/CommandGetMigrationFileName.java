package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

public class CommandGetMigrationFileName {
    public static String getFileName(CommandLine cmd) {
        return cmd.getOptionValue("m");
    }

}

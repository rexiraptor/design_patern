package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

public class CommandGetFileName {
    public static String getFileName(CommandLine cmd) {
        return cmd.getOptionValue("s");
    }
}
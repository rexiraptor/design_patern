package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

public class CommandGetOpt {
    public static String getOptionValue(CommandLine cmd, String option) {
        return cmd.getOptionValue(option);
    }
}

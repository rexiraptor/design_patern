package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.*;

//class that parse the command line
public class CommandParser {
    public static CommandLine parseCommandLine(String[] args, Options cliOptions) {
        CommandLineParser parser = new DefaultParser();

        try {
            return parser.parse(cliOptions, args);
        } catch (ParseException ex) {
            throw new UnsupportedOperationException("Fail to parse arguments: " + ex.getMessage());
        }
    }
}

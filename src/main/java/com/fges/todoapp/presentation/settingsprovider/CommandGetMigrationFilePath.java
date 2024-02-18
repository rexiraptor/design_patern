package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.nio.file.Path;
import java.nio.file.Paths;

// Class that returns the path of the file we want to migrate
public class CommandGetMigrationFilePath {
    public static Path getFilePath(CommandLine cmd) {return Paths.get(CommandGetMigrationFileName.getFileName(cmd));}
}

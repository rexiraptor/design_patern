package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.nio.file.Path;
import java.nio.file.Paths;

//class qui renvoie le chemin du fichier vers lequel on veut migrer (opt -m)
public class CommandGetMigrationFilePath {
    public static Path getFilePath(CommandLine cmd) {return Paths.get(CommandGetMigrationFileName.getFileName(cmd));}
}

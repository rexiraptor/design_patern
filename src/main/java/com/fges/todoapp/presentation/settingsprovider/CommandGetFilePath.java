package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.nio.file.Path;
import java.nio.file.Paths;
//class qui renvoie le chemin vers un fichier
public class CommandGetFilePath {
    public static Path getFilePath(CommandLine cmd) {
        return Paths.get(CommandGetFileName.getFileName(cmd));

    }
}

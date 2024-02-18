package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Class that returns the string content of a file, which can be used by
// either a CommandLine or a Path

public class CommandGetFileContent {
    public static String getFileContent(CommandLine cmd) throws IOException {
        var filePath = CommandGetFilePath.getFilePath(cmd);
        return getFileContent(filePath);

}
        public static String getFileContent(Path filePath) throws IOException {
            return Files.exists(filePath) ? Files.readString(filePath) : "";
        }
    }


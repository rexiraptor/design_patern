package com.fges.todoapp.presentation.settingsprovider;

import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommandGetFileContent {
    public static String getFileContent(CommandLine cmd) throws IOException {
        var filePath = CommandGetFilePath.getFilePath(cmd);
        return getFileContent(filePath);

}
        public static String getFileContent(Path filePath) throws IOException {
            return Files.exists(filePath) ? Files.readString(filePath) : "";
        }
    }


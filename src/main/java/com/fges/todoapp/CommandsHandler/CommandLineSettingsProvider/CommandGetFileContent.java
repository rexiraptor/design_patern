package com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommandGetFileContent {
    public static String getFileContent(Path filePath) throws IOException {

        return Files.readString(filePath);
    }
}

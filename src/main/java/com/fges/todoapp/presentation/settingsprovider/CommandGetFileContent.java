package com.fges.todoapp.presentation.settingsprovider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommandGetFileContent {
    public static String getFileContent(Path filePath) throws IOException {

        return Files.readString(filePath);
    }
}

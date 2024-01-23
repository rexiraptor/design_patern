package com.fges.todoapp.FileHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
public abstract class FileHandlerBase {
    public abstract void insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath) throws IOException;

    public abstract void list(String fileName, String fileContent) throws JsonProcessingException;

}

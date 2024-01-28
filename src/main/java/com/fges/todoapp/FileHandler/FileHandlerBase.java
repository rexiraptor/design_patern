package com.fges.todoapp.FileHandler;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
public interface  FileHandlerBase {
     void insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath) throws IOException;

    void list(String fileContent) throws JsonProcessingException;

}

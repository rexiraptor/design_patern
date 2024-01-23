package com.fges.todoapp.FileHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileHandler extends FileHandlerBase {

    @Override
    public void insert(List<String> positionalArgs, String fileName, String fileContent, Path filePath) throws IOException {
        if (positionalArgs.size() < 2) {
            System.err.println("Missing TODO name");
            return ;
        }
        String todo = positionalArgs.get(1);

        if (!fileContent.endsWith("\n") && !fileContent.isEmpty()) {
            fileContent += "\n";
        }
        fileContent += todo;

        Files.writeString(filePath, fileContent);
    }

    @Override
    public void list(String fileName, String fileContent){
        System.out.println(Arrays.stream(fileContent.split("\n"))
                .map(todo -> "- " + todo)
                .collect(Collectors.joining("\n"))
        );
    }

    public static boolean isCsv(String fileName){
        return fileName.endsWith(".csv");
    }

}


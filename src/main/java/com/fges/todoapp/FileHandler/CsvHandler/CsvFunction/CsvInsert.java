package com.fges.todoapp.FileHandler.CsvHandler.CsvFunction;

import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandCheckParams;
import com.fges.todoapp.Task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CsvInsert {

    private static final Logger LOGGER = Logger.getLogger(CsvInsert.class.getName());

    public static void insert(List<String> positionalArgs, String fileContent, Path filePath) {
        try {
            if(CommandCheckParams.checkparams(positionalArgs)){
                String todo = positionalArgs.get(1);

                Task task = new Task(todo);

                if (!fileContent.endsWith("\n") && !fileContent.isEmpty()) {
                    fileContent += "\n";
                }

                fileContent += task.getName(); //+"|"

                Files.writeString(filePath, fileContent);
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error writing to file", e);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error during insertion", e);
        }
    }
}

package com.fges.todoapp;



import com.fges.todoapp.FileHandler.CsvFileHandler;
import com.fges.todoapp.FileHandler.JsonFileHandler;
import com.fges.todoapp.List.CommandsHandler;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/**
 * Hello world!
 */
public class App {

    /**
     * Do not change this method
     */
    public static void main(String[] args) throws Exception {
        System.exit(exec(args));
    }

    public static int exec(String[] args) throws IOException {
        Options cliOptions = new Options();
        CommandLineParser parser = new DefaultParser();

        cliOptions.addRequiredOption("s", "source", true, "File containing the todos");

        CommandLine cmd;
        try {
            cmd = parser.parse(cliOptions, args);
        } catch (ParseException ex) {
            System.err.println("Fail to parse arguments: " + ex.getMessage());
            return 1;
        }

        String fileName = cmd.getOptionValue("s");

        List<String> positionalArgs = cmd.getArgList();
        if (positionalArgs.isEmpty()) {
            System.err.println("Missing Command");
            return 1;
        }

        String command = positionalArgs.get(0);

        Path filePath = Paths.get(fileName);

        String fileContent = "";

        if (Files.exists(filePath)) {
            fileContent = Files.readString(filePath);
        }
        if (CommandsHandler.isInsert(command)) {
            if (CsvFileHandler.isCsv(fileName)) {
                CsvFileHandler csvFileHandler = new CsvFileHandler();

                csvFileHandler.insert(positionalArgs, fileName, fileContent, filePath);
            } else if (JsonFileHandler.isJson(fileName)) {
                JsonFileHandler jsonFileHandler = new JsonFileHandler();

                jsonFileHandler.insert(positionalArgs, fileName, fileContent, filePath);
            } else {
                System.err.println("Unsupported file type");
            }
        } else if (CommandsHandler.isList(command)) {
            if (CsvFileHandler.isCsv(fileName)) {
                CsvFileHandler csvFileHandler = new CsvFileHandler();

                csvFileHandler.list(fileName, fileContent);
            } else if (JsonFileHandler.isJson(fileName)) {
                JsonFileHandler jsonFileHandler = new JsonFileHandler();

                jsonFileHandler.list(fileName, fileContent);
            } else {
                System.err.println("Unsupported file type");
            }
        } else {
            System.err.println("Unsupported command");
        }

        System.err.println("Done.");
        return 0;
    }
}

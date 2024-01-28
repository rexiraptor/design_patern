package com.fges.todoapp;



import com.fges.todoapp.CommandsHandler.*;
import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandGetCommand;
import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandGetFileContent;
import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandGetFileName;
import com.fges.todoapp.CommandsHandler.CommandLineSettingsProvider.CommandParser;
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


        cliOptions.addRequiredOption("s", "source", true, "File containing the todos");

        CommandLine cmd;

        cmd= CommandParser.parseCommandLine(args,cliOptions);


        String fileName = CommandGetFileName.getFileName(cmd);

        List<String> positionalArgs = CommandGetCommand.getCommand(cmd);

        String command = positionalArgs.get(0);

        Path filePath = Paths.get(fileName);

        String fileContent = "";

        if (Files.exists(filePath)) {
            fileContent = CommandGetFileContent.getFileContent(filePath);
        }
        try {
            CommandExecutor.executeCommand( fileName, command, positionalArgs, fileContent, filePath);
        } catch (IOException e) {
            System.err.println("Erreur d'entrée/sortie : " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.err.println("Opération non prise en charge : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Une erreur inattendue s'est produite : " + e.getMessage());
        }

        System.err.println("Done.");
        return 0;
    }
}

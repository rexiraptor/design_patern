package com.fges.todoapp;



import com.fges.todoapp.logic.commandhandler.CliOptionHandler;
import com.fges.todoapp.logic.CommandExecutor;
import com.fges.todoapp.presentation.settingsprovider.*;
import org.apache.commons.cli.*;

import java.io.IOException;


// Main class that manages the overall logic of the application
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

        CliOptionHandler cliOptionHandler =new CliOptionHandler();

        CommandLine cmd= CommandParser.parseCommandLine(args,cliOptionHandler.cliOptionHandler());

        String command = CommandGetCommand.getCommand(cmd).get(0);


        try {
            CommandExecutor commandExecutor = new CommandExecutor();
            commandExecutor.executeCommand(
                    command,
                    cmd
            );
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

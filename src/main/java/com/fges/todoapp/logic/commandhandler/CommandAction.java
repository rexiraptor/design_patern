package com.fges.todoapp.logic.commandhandler;

import org.apache.commons.cli.CommandLine;
import java.io.IOException;

// interface représentant la structure d'une action/commande a effectuer

@FunctionalInterface
public interface CommandAction {
    void execute(CommandLine cmd) throws IOException;
}

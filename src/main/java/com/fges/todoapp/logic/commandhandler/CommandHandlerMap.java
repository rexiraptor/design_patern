// CommandActionInitializer.java
package com.fges.todoapp.logic.commandhandler;


import java.util.HashMap;
import java.util.Map;

public class CommandHandlerMap {

        public static Map<String, CommandAction> initializeCommandActions() {
            Map<String, CommandAction> commandActions = new HashMap<>();
            commandActions.put("insert", new InsertAction());
            commandActions.put("list", new ListAction());
            commandActions.put("migration", new MigrationAction());

            // Ajoutez d'autres commandes ici
            return commandActions;
        }
}



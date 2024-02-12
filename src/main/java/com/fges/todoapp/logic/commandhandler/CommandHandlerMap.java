// CommandActionInitializer.java
package com.fges.todoapp.logic.commandhandler;


import java.util.HashMap;
import java.util.Map;

public class CommandHandlerMap {

        public static Map<String, FileCommandAction> initializeCommandActions() {
            Map<String, FileCommandAction> commandActions = new HashMap<>();
            commandActions.put("insert", new InsertAction());
            commandActions.put("list", new ListAction());
            // Ajoutez d'autres commandes ici
            return commandActions;
        }
}



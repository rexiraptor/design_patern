// CommandActionInitializer.java
package com.fges.todoapp.logic.commandhandler;


import com.fges.todoapp.logic.commandhandler.action.CommandAction;
import com.fges.todoapp.logic.commandhandler.action.InsertAction;
import com.fges.todoapp.logic.commandhandler.action.ListAction;
import com.fges.todoapp.logic.commandhandler.action.MigrationAction;

import java.util.HashMap;
import java.util.Map;

// Class grouping the different allowed actions/commands in the application,
// and to which class it corresponds in each case


public class CommandHandlerMap {

        public static Map<String, CommandAction> initializeCommandActions() {
            Map<String, CommandAction> commandActions = new HashMap<>();
            commandActions.put("insert", new InsertAction());
            commandActions.put("list", new ListAction());
            commandActions.put("migrate", new MigrationAction());

            // add more command here
            return commandActions;
        }
}



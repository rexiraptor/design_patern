// CommandActionInitializer.java
package com.fges.todoapp.logic.commandhandler;


import com.fges.todoapp.logic.commandhandler.action.CommandAction;
import com.fges.todoapp.logic.commandhandler.action.fileaction.FileInsertAction;
import com.fges.todoapp.logic.commandhandler.action.fileaction.FileListAction;
import com.fges.todoapp.logic.commandhandler.action.fileaction.FileMigrationAction;
import com.fges.todoapp.logic.commandhandler.action.webaction.WebStartAction;

import java.util.HashMap;
import java.util.Map;

// Class grouping the different allowed actions/commands in the application,
// and to which class it corresponds in each case


public class CommandHandlerMap {

        public static Map<String, CommandAction> initializeCommandActions() {
            Map<String, CommandAction> commandActions = new HashMap<>();
            commandActions.put("insertFile", new FileInsertAction());
            commandActions.put("listFile", new FileListAction());
            commandActions.put("migrateFile", new FileMigrationAction());
            commandActions.put("webStartFile", new WebStartAction());

            // add more command here
            return commandActions;
        }
}



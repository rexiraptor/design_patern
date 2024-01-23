package com.fges.todoapp.List;

public class CommandsHandler {

    public static boolean isInsert(String command){
        return command.equals("insert");
    }
    public static boolean isList(String command){
        return command.equals("list");

    }
}

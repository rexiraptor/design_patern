package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.logic.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.taskmanager.taskvariable.GetIsDone;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;

public class ListAction implements FileCommandAction {
    @Override
    public void execute(FileHandlerBase fileHandler, CommandLine cmd) throws IOException {
        PrintManager printManager =new PrintManager();
        printManager.printList(
                fileHandler.list(CommandGetFileContent.getFileContent(cmd)),
                GetIsDone.getValue(cmd));
    }
}

package com.fges.todoapp.logic.commandhandler;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.FileHandlerFactory;
import com.fges.todoapp.logic.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import com.fges.todoapp.taskmanager.taskvariable.GetIsDone;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;

public class ListAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetFileName.getFileName(cmd));

        PrintManager printManager =new PrintManager();
        printManager.printList(
                fileHandler.list(CommandGetFileContent.getFileContent(cmd)),
                GetIsDone.getValue(cmd));
    }
}

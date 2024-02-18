package com.fges.todoapp.logic.commandhandler.action;

import com.fges.todoapp.data.file.FileHandlerBase;
import com.fges.todoapp.data.file.FileHandlerFactory;
import com.fges.todoapp.presentation.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import com.fges.todoapp.presentation.settingsprovider.GetOptDone;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
// Class representing what action to take when the user uses the 'list' command.

public class ListAction implements CommandAction {
    @Override
    public void execute(CommandLine cmd) throws IOException {
        FileHandlerFactory fileHandlerFactory = new FileHandlerFactory();
        FileHandlerBase fileHandler = fileHandlerFactory.createFileHandler(CommandGetFileName.getFileName(cmd));

        PrintManager printManager =new PrintManager();
        printManager.printList(
                fileHandler.list(CommandGetFileContent.getFileContent(cmd)),
                GetOptDone.getValue(cmd));
    }
}

package com.fges.todoapp.logic.commandhandler.action;

import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.data.FileHandlerFactory;
import com.fges.todoapp.presentation.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileName;
import com.fges.todoapp.presentation.settingsprovider.GetOptDone;
import org.apache.commons.cli.CommandLine;
import java.io.IOException;
//class représentant quel action(fonction) effectuer lorsque l'utilisateur utilise la command list

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

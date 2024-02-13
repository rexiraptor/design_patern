package com.fges.todoapp.data.csvhandler;

import com.fges.todoapp.data.csvhandler.csvfunction.CsvInsert;
import com.fges.todoapp.data.csvhandler.csvfunction.CsvList;
import com.fges.todoapp.data.FileHandlerBase;
import com.fges.todoapp.logic.PrintManager;
import com.fges.todoapp.presentation.settingsprovider.CommandGetFileContent;
import org.apache.commons.cli.CommandLine;

import java.io.IOException;

public class CsvFileBase implements FileHandlerBase {

    @Override
    public void insert(CommandLine cmd)  {
        CsvInsert.insert(cmd);
    }

    @Override
    public void list(CommandLine cmd) throws IOException {
        PrintManager printManager =new PrintManager();
        printManager.printList(
                CsvList.list(CommandGetFileContent.getFileContent(cmd)),
                cmd
        );

    }



}


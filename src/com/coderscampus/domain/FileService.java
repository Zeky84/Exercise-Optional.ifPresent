package com.coderscampus.domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileService {
    public List<SuspectLocation> loadSuspects(String weekFile) throws IOException {
        String[] headerLine;
        List<SuspectLocation> allSuspectsInfo= new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(weekFile))) {
            String line;
            //Reading the header line of the file to avoid the try-catch message
            headerLine = fileReader.readLine().split(",");
            while ((line = fileReader.readLine()) != null) {
                //NOTE
                try {
                    allSuspectsInfo.add(new SuspectLocation(line.split(",")));
                } catch (NumberFormatException nfe) {
                    System.out.println("NumberFormat Exception: " + nfe +
                            " Because first line of the file contains header," );
                }
            }
        }
        return allSuspectsInfo;
    }
}

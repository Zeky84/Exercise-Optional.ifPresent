package com.coderscampus.domain;

import java.io.IOException;
import java.util.List;

public class SuspectLocationApplication {
    public static void main(String[] args) throws IOException {
        //Reading CSV files and storing each file in a list by week
        FileService loadingFile = new FileService();
        List<SuspectLocation> week1 = loadingFile.loadSuspects("InterpolWatchReport-Week1.csv");
        List<SuspectLocation> week2 = loadingFile.loadSuspects("InterpolWatchReport-Week2.csv");
        List<SuspectLocation> week3 = loadingFile.loadSuspects("InterpolWatchReport-Week3.csv");

        //Streaming each list
        SuspectLocationService analizingSuspectList = new SuspectLocationService();
        analizingSuspectList.findingSuspect(week1,"CARMEN SANDIEGO");
        analizingSuspectList.findingSuspect(week2,"CARMEN SANDIEGO");
        analizingSuspectList.findingSuspect(week3,"CARMEN SANDIEGO");

        }

}
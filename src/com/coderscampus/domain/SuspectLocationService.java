package com.coderscampus.domain;

import java.util.List;

public class SuspectLocationService {
    public void findingSuspect(List<SuspectLocation> week,String suspectToFind){
        //Stream over the list
        week.stream()
                .filter(suspectName -> suspectName.getName().equals(suspectToFind))
                .findAny()
                .ifPresentOrElse(suspectLocation -> System.out.println(capitalizingName(suspectLocation.getName()) +
                        "is in... " + suspectLocation.getCountry().get()),()->System.out.println("Galdang, just missed her!"));
    }
    public static String capitalizingName(String name){
        //Capitalize first letter of each word of the name
        String capitalizeTotalName="";
        String[] splitFullName = name.split(" ");
        for (String word: splitFullName){
            String capWord =  word.substring(0,1)+word.substring(1).toLowerCase();
            capitalizeTotalName += capWord + " ";
        }
        return capitalizeTotalName;

    }
}

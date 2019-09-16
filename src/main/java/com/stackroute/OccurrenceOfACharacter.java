package com.stackroute;

public class OccurrenceOfACharacter {

    public int getOccurrence(String str,char givenChar)
    {
        String character="";
        character=character+givenChar;
        String strReplace=str.replace(character,"");
        //System.out.println(strReplace);
        System.out.println(str.length()-strReplace.length());
        return str.length()-strReplace.length();
    }
}

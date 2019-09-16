package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrencesOfACharacterTest {
    private static OccurrenceOfACharacter occurencesOfACharacter;
    @BeforeClass
    public static void create()
    {
        occurencesOfACharacter=new OccurrenceOfACharacter();
    }
    @AfterClass
    public static void destroy()
    {
        occurencesOfACharacter=null;
    }
    @Test
    public void getOccurrenceOfACharacter_StringAndCharacter_CountOfOccurance()
    {
        assertEquals("Error in getOccurrence(): should return occurrence of given character",10,occurencesOfACharacter.getOccurrence("Java is java again java again count",'a'));
    }
    @Test
    public void getOccurrenceOfACharacter_StringAndCharacter_CountOfOccurance_Failure()
    {
        assertNotEquals("Error in getOccurrence(): should return occurrence of given character, Check the proper character",10,occurencesOfACharacter.getOccurrence("JAva is java again java again count",'a'));
        assertNotNull("Error in getOccurrence(): shouldn't return null",occurencesOfACharacter.getOccurrence("The quick brown fox",'a'));
    }
}

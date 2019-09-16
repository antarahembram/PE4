package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {

    private static MultipleOccurrence multipleOccurrence;
    @BeforeClass
    public static void create()
    {
        multipleOccurrence=new MultipleOccurrence();
    }
    @AfterClass
    public static void destroy()
    {
        multipleOccurrence=null;
    }
    @Test
    public void getMultipleOccurrencesTest_InputStringWithStingtoBeFound_ListOfStartEndIndex()
    {
        List<String> occurrenceList=new ArrayList<String >();
        occurrenceList.add("4-6");
        occurrenceList.add("10-12");
        occurrenceList.add("27-29");
        assertEquals("Error in getMultipleOccurrences(): ",occurrenceList,multipleOccurrence.getMultipleOccurrences("She sells seashells by the seashore","se"));
    }
    @Test
    public void getMultipleOccurrencesTest_InputStringWithStingtoBeFound_ListOfStartEndIndex_Failure()
    {
        List<String> occurrenceList=new ArrayList<String >();
        occurrenceList.add("2-5");
        occurrenceList.add("4-7");
        assertNotEquals("Error in getMultipleOccurrences():  ",occurrenceList,multipleOccurrence.getMultipleOccurrences("Sheseslls seashells by the seashore","ese"));
        assertNotNull("Error in getMultipleOccurrences(): should not return null",multipleOccurrence.getMultipleOccurrences("Sheseslls seashells by the seashore","ese"));

    }
}

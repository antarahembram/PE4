package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AlphabeticallySortTest {
    private static AlphabeticallySort alphabeticallySort;
    @BeforeClass
    public static void create()
    {
        alphabeticallySort=new AlphabeticallySort();
    }
    @AfterClass
    public static void destroy()
    {
        alphabeticallySort=null;
    }
    @Test
    public void getSortedListTest_TextString_SortedListOfString()
    {
        String[] sorted={"She","by","seashells","seashore","sells", "the"};
        assertEquals("Error in getSortedList(): ",sorted,alphabeticallySort.getSortedList("She sells seashells by the seashore"));
        assertArrayEquals("Error in getSortedList(): ",sorted,alphabeticallySort.getSortedList("She sells seashells by the seashore"));

    }
    @Test
    public void getSortedListTest_TextString_SortedListOfString_Failure()
    {
        String[] sorted={"She","by","seashore","seashells","sells", "the"};
        assertNotEquals("Error in getSortedList(): ",sorted,alphabeticallySort.getSortedList("She sells seashells by the seashore"));
        assertNotNull("Error in getSortedList(): should't return null ",alphabeticallySort.getSortedList("She sells seashells by the seashore"));
    }
}

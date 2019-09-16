package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    private static Replace replace;
    @BeforeClass
    public static void create()
    {
        replace=new Replace();
    }
    @AfterClass
    public static void destroy()
    {
        replace=null;
    }
    @Test
    public void getReplacedStringTest_OriginalString_ReplacedString()
    {
        assertEquals("Error in getOccurrence(): should return occurrence of given character","faity fry",replace.getReplacedString("daily dry"));
    }
    @Test
    public void getReplacedStringTest_OriginalString_ReplacedString_Failure()
    {
        assertNotEquals("Error in getOccurrence(): should return occurrence of given character, d is being replaced by f","daity dry",replace.getReplacedString("daily dry"));
        assertNotNull("Error in getOccurrence(): shouldn't return null",replace.getReplacedString("daily dry"));
    }
}

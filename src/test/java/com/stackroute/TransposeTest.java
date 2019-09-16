package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    private static Transpose transpose;
    @BeforeClass
    public static void create()
    {
        transpose=new Transpose();
    }
    @AfterClass
    public static void destroy()
    {
        transpose=null;
    }
    @Test
    public void getTransposeTest_String_TransposedString()
    {
        assertEquals("Error in getTranspose(): should return occurrence of given character","a kciuq nworb xof spmuj revo eht yzal god",transpose.getTranspose("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void getTransposeTest_String_TransposedString_Failure()
    {
        assertNotEquals("Error in getTranspose(): don't return the return the words in reverse order","dog lazy the over jump fox brown quick a",transpose.getTranspose("a quick brown fox jumps over the lazy dog"));
        assertNotNull("Error in getTranspose(): don't return null",transpose.getTranspose("a quick brown fox jumps over the lazy dog"));

    }
}

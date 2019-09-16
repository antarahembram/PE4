package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresenceInStringTest {

        private static PresenceInString presenceInString;
        @BeforeClass
        public static void create()
        {
            presenceInString=new PresenceInString();
        }
        @AfterClass
        public static void destroy()
        {
            presenceInString=null;
        }
        @Test
        public void checkPresenceTest_InputString_Boolean()
        {
            assertTrue("Error in checkPresence(): should be true if inputString contains 'Harry'",presenceInString.checkPresence("This is Harry."));
            assertEquals("Error in checkPresence(): should be true if inputString contains 'Harry'",true,presenceInString.checkPresence("Is Harry here?."));
        }
        @Test
        public void checkPresenceTest_InputStringAndString_Boolean_Failure()
        {
                assertFalse("Error in checkPresence(): inputString contains 'Harry'",presenceInString.checkPresence("This is Henry."));
                assertNotNull("Error in checkPresence(): inputString contains 'Harry'",presenceInString.checkPresence("This is Henry."));
        }

}

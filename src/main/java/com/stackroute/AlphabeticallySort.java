package com.stackroute;

import java.util.Arrays;

public class AlphabeticallySort {
    public String[] getSortedList(String text)
    {
        String[] splittedText=text.split(" ");
        Arrays.sort(splittedText);
        for(String i:splittedText)
        {
            System.out.println(i);
        }
        return splittedText;
    }
}

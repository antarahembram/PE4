package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {
    public List<String> getMultipleOccurrences(String inputString, String str)
    {
        List<String > occurrenceList=new ArrayList<String>();
        Pattern pattern=Pattern.compile(str);
        Matcher matcher=pattern.matcher(inputString);


        while (matcher.find())
        {
            String s="";
            s=s+matcher.start()+"-"+matcher.end(0);
            System.out.println(matcher.start());
            System.out.println(matcher.end(0));
            occurrenceList.add(s);
        }

        return occurrenceList;
    }
}

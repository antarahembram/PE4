package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresenceInString {
    public boolean checkPresence(String inputString)
    {
        String Regex="Harry";
        Pattern pattern=Pattern.compile(Regex);
        Matcher matcher=pattern.matcher(inputString);
        return matcher.find();
    }
}

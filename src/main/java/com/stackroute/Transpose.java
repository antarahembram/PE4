package com.stackroute;

public class Transpose {
    public String getTranspose(String str)
    {
        String[] splittedstr=str.split(" ");
       // String[] final_splitted=new String[splittedstr.length];
        String final_output="";
        for(int i=0;i<splittedstr.length;i++)
        {
            String transRow="";
            int j;
            for(j=splittedstr[i].length()-1;j>=0;j--)
            {
                transRow=transRow+splittedstr[i].charAt(j);
            }
            final_output=final_output+transRow+" ";
        }
        final_output=final_output.trim();
        return final_output;
    }
}

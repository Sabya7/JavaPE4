package main.java.com.stackroute.pe4;
/*a program to find out the multiple occurrences of the given word in a string using Matcher
methods.*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesOfAGivenWord {
    public static String findAllOccurences(String s,String pattern)
    {    String result="";
        Pattern p = Pattern.compile(pattern); //compiles the regex into a pattern
        Matcher m = p.matcher(s);
        while(m.find())
        {
            result=result.concat("Found at: "+m.start()+"-"+m.end()).concat("\n");
        }
        return result.trim();
    }
}

package main.java.com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
* */
public class DoesStringContain {
    public static String checkString(String input,String find)
    {
        Pattern pattern=Pattern.compile(find);
        Matcher matcher=pattern.matcher(input);
        if(matcher.find()) //returns true if string contains find.
            return "Is "+find+" here ? true";
        else
            return "Is "+find+" here ? false";
    }
}

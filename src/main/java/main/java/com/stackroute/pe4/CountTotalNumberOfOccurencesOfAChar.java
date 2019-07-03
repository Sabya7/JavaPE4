package main.java.com.stackroute.pe4;
/*This program counts the total number of occurrences of a character in a given string.

* */
public class CountTotalNumberOfOccurencesOfAChar {
    public static int countOccurences(String s,String a)
    {
        return s.length()-s.toLowerCase().replaceAll(a,"").length();
        //difference in lengths of both the strings gives the result;
    }
}

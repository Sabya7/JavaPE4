package main.java.com.stackroute.pe4;

import java.util.Arrays;
//This function takes a paragraph in string and sorts them and return the resultant para as a string
public class DisplayTheSortedWords {
    public static String sortAndDisplay(String s)
    {   String result="";
        String[] arr=s.split(" ");   //splits the para into string array where each element contains a word.
        Arrays.sort(arr); // sorts the array.
        for(String a:arr)
        {
            result=result.concat(a).concat(" ");  //appends each word into the resultant string.
        }
        return result.trim(); //removes the leading and trailing spaces
    }
}

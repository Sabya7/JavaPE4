package main.java.com.stackroute.pe4;
/* a program to transpose the given string.*/
public class StringTranspose {
    public static String transpose(String s)
    {
        String[] arr;String result="";
        arr=s.split(" ");  // stores the words in a array
        for(String a:arr)
        {
            StringBuilder sb=new StringBuilder(a);
            sb=sb.reverse();//reverse each word
            result=result.concat(sb.toString()).concat(" ");

        }
        return result.trim();
    }
}

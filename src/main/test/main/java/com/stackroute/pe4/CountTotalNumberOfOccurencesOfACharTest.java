package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTotalNumberOfOccurencesOfACharTest {
    @Test
    public void OccurencesShouldReturn2()
    {
        int result=CountTotalNumberOfOccurencesOfAChar.countOccurences("Java bcd","a");
        assertEquals(2,result);
    }
    @Test
    public void OccurencesShouldReturn3()
    {
        int result=CountTotalNumberOfOccurencesOfAChar.countOccurences("Sabyasachi","a");
        assertEquals(3,result);
    }
    @Test
    public void OccurencesShouldReturn0()
    {
        int result=CountTotalNumberOfOccurencesOfAChar.countOccurences("bcde","a");
        assertEquals(0,result);
    }

}
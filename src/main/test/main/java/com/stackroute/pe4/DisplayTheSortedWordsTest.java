package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayTheSortedWordsTest {

    @Test
    public void sortAndDisplayShouldReturnProperly() {
        String result=DisplayTheSortedWords.sortAndDisplay("I am Sabyasachi");
        assertEquals("I Sabyasachi am",result);
    }

    @Test
    public void sortAndDisplayShouldReturnProperly1() {
        String result=DisplayTheSortedWords.sortAndDisplay("I Am Sabyasachi");
        assertEquals("Am I Sabyasachi",result);
    }
    @Test
    public void sortAndDisplayShouldReturnProperly2() {
        String result=DisplayTheSortedWords.sortAndDisplay("Omm Namah Shivaya");
        assertEquals("Namah Omm Shivaya",result);
    }
}
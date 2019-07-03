package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesOfAGivenWordTest {

    @Test
    public void findAllOccurences() {
        String result=MultipleOccurencesOfAGivenWord.findAllOccurences("She sells seashells by the seashore","se");
        assertEquals("Found at: 4-6\n" +
                "Found at: 10-12\n" +
                "Found at: 27-29",result);
    }
    @Test
    public void findAllOccurences1() {
        String result=MultipleOccurencesOfAGivenWord.findAllOccurences("She sells seashells by the seashore","s");
        assertEquals("Found at: 4-5\n" +
                "Found at: 8-9\n" +
                "Found at: 10-11\n" +
                "Found at: 13-14\n" +
                "Found at: 18-19\n" +
                "Found at: 27-28\n" +
                "Found at: 30-31",result);
    }
    @Test
    public void findAllOccurences2() {
        String result=MultipleOccurencesOfAGivenWord.findAllOccurences("She sells seashells by the seashore","by");
        assertEquals("Found at: 20-22",result);
    }
}
package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {
    @Test
    public void rePlaceShouldReturnCorrectly()
    {
        String result=ReplaceAll.rePlace("daily dry");
        assertEquals("faity fry",result);
    }

    @Test
    public void rePlaceShouldReturnCorrectly2()
    {
        String result=ReplaceAll.rePlace("dal");
        assertEquals("fat",result);
    }

    @Test
    public void rePlaceShouldReturnCorrectly3()
    {
        String result=ReplaceAll.rePlace("dull");
        assertEquals("futt",result);
    }
}
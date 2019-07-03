package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoesStringContainTest {

    @Test
    public void checkStringReturnsTrue() {
        String result=DoesStringContain.checkString("I am Sabyasachi","Sabya");
        assertEquals("Is Sabya here ? true",result);
    }
    @Test
    public void checkStringReturnsFalse() {
        String result=DoesStringContain.checkString("I am Sabyasachi","Sahoo");
        assertEquals("Is Sahoo here ? false",result);
    }
    @Test
    public void checkStringReturnsTrue2() {
        String result=DoesStringContain.checkString("Har Har Mahadev","Mahadev");
        assertEquals("Is Mahadev here ? true",result);

    }
}
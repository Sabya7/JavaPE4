package main.java.com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    @Test
    public void transpose() {
        String result=StringTranspose.transpose("abcd efgh");
        assertEquals("dcba hgfe",result);
    }
    @Test
    public void transpose2() {
        String result=StringTranspose.transpose("sabyasachi sahoo");
        assertEquals("ihcasaybas oohas",result);
    }
    @Test
    public void transpose3() {
        String result=StringTranspose.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
}
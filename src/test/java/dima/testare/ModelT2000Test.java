package dima.testare;

import dima.ModelT1000;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ModelT2000Test {
    @Autowired
    private Robot cd;
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
    @Test
    public void cdShouldNotBeNull1() {
        cd.dance();
    }


}
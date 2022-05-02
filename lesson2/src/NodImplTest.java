package ru.edu;

import org.junit.Assert;
import org.junit.Test;

public class NodImplTest {

    @Test
    public void calculateTest(){
        NodImpl calculate = new NodImpl();

        Assert.assertEquals(5, calculate.calculate(5,25));
        Assert.assertEquals(5, calculate.calculate(25,5));
    }
}

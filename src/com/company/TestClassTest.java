package com.company;


import org.junit.Assert;
import org.testng.annotations.Test;

public class TestClassTest {

    @Test
    public void testMaximumTemperature() {
        byte[] measurements = {10, 11, 30};
        int max = MaxandMin.getMaxTemperature(measurements);
        Assert.assertEquals(max, 30);
    }


}
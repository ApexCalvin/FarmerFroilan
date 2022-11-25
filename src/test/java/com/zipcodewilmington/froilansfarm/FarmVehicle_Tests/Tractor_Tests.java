package com.zipcodewilmington.froilansfarm.FarmVehicle_Tests;

import FarmVehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class Tractor_Tests {

    @Test
    public void constructorTest(){
        Tractor t = new Tractor("Tracy");
        String actual = t.getName();
        String expected = "Tracy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void constructorTest_nullary() {
        Tractor t = new Tractor();
        t.setName("Tracy");
        String actual = t.getName();
        String expected = "Tracy";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void makeNoiseTest() {
        Tractor t = new Tractor();
        String actual = t.makeNoise();
        String expected = "Chuga chuga...";
        Assert.assertEquals(actual, expected);
    }
}

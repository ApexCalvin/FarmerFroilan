package com.zipcodewilmington.froilansfarm.FarmVehicle_Tests;

import FarmVehicle.FarmVehicle;
import org.junit.Assert;
import org.junit.Test;

public class FarmVehicle_Tests {

    @Test
    public void constructorTest(){
        FarmVehicle fv = new FarmVehicle("Sasha");
        String actual = fv.getName();
        String expected = "Sasha";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void constructorTest_nullary() {
        FarmVehicle fv = new FarmVehicle();
        fv.setName("Sasha");
        String actual = fv.getName();
        String expected = "Sasha";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void makeNoiseTest() {
        FarmVehicle fv = new FarmVehicle();
        String actual = fv.makeNoise();
        String expected = "Vroom!";
        Assert.assertEquals(actual, expected);
    }
}

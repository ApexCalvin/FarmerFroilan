package com.zipcodewilmington.froilansfarm.FarmVehicle_Tests;

import FarmVehicle.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class CropDuster_Tests {

    @Test
    public void constructorTest(){
        CropDuster cd  = new CropDuster("Cody");
        String actual = cd.getName();
        String expected = "Cody";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void constructorTest_nullary() {
        CropDuster cd  = new CropDuster();
        cd.setName("Cody");
        String actual = cd.getName();
        String expected = "Cody";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void makeNoiseTest() {
        CropDuster cd  = new CropDuster();
        String actual = cd.makeNoise();
        String expected = "Wub-wub wub-wub!";
        Assert.assertEquals(actual, expected);
    }
}

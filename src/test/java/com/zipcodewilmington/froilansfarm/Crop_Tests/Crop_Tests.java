package com.zipcodewilmington.froilansfarm.Crop_Tests;

import Crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class Crop_Tests {
    @Test
    public void cropSetTrueTest() {
        Crop crop = new Crop();
        crop.setHarvestToTrue();
        boolean expected = crop.hasBeenHarvested();
        Assert.assertTrue(expected);
    }
    @Test
    public void cropSetFalseTest() {
        Crop crop = new Crop();
        crop.setHarvestToFalse();
        boolean expected = crop.hasBeenHarvested();
        Assert.assertFalse(expected);
    }
}

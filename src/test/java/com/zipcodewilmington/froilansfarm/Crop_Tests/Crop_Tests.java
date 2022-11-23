package com.zipcodewilmington.froilansfarm.Crop_Tests;

import Crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class Crop_Tests {
    @Test
    public void cropSetHarvestedTrueTest() {
        Crop crop = new Crop();
        crop.setHarvestToTrue();
        boolean expected = crop.getHarvested();
        Assert.assertTrue(expected);
    }
    @Test
    public void cropSetHarvestedFalseTest() {
        Crop crop = new Crop();
        crop.setHarvestToFalse();
        boolean expected = crop.getHarvested();
        Assert.assertFalse(expected);
    }
    @Test
    public void cropSetFertilizedTrueTest() {
        Crop crop = new Crop();
        crop.setFertilizedTrue();
        boolean expected = crop.getFertilized();
        Assert.assertTrue(expected);
    }
    @Test
    public void cropSetFertilizedFalseTest() {
        Crop crop = new Crop();
        crop.setFertilizedFalse();
        boolean expected = crop.getFertilized();
        Assert.assertFalse(expected);
    }
}

package com.zipcodewilmington.froilansfarm.Crop_Tests;

import Crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlant_Tests {
    @Test
    public void tomatoPlantSetFertilizedTrueTest() {
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilizedTrue();
        boolean expected = tp.getFertilized();
        Assert.assertTrue(expected);
    }
    @Test
    public void tomatoPlantSetFertilizedFalseTest() {
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilizedFalse();
        boolean expected = tp.getFertilized();
        Assert.assertFalse(expected);
    }
}

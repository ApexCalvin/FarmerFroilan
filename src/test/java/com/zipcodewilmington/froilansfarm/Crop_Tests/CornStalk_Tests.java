package com.zipcodewilmington.froilansfarm.Crop_Tests;

import Crop.Cornstalk;
import org.junit.Assert;
import org.junit.Test;

public class CornStalk_Tests {
    @Test
    public void cornstalkSetFertilizedTrueTest() {
        Cornstalk cs = new Cornstalk();
        cs.setFertilizedTrue();
        boolean expected = cs.getFertilized();
        Assert.assertTrue(expected);
    }
    @Test
    public void cornstalkSetFertilizedFalseTest() {
        Cornstalk cs = new Cornstalk();
        cs.setFertilizedFalse();
        boolean expected = cs.getFertilized();
        Assert.assertFalse(expected);
    }
}

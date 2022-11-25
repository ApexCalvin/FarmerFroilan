package com.zipcodewilmington.froilansfarm.Crop_Tests;

import Crop.Cornstalk;
import Crop.CropRow;
import Crop.PotatoPlant;
import Crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class CropRow_Test {
    @Test
    public void cropSetHarvestedTrueTest() {
        CropRow cropRow = new CropRow();
        Cornstalk cs = new Cornstalk();
        TomatoPlant tp = new TomatoPlant();

        cropRow.add(cs);
        cropRow.add(tp);

        int expected = 2;
        int actual = cropRow.size();

        Assert.assertEquals(expected, actual);

    }
}

package com.zipcodewilmington.froilansfarm.Food_Tests;

import Food.*;
import org.junit.Assert;
import org.junit.Test;

public class FoodCrate_Test {
    @Test
    public void foodCrateConstructorTest() {
        FoodCrate foodCrate = new FoodCrate();

        CornBasket cb = new CornBasket();
        TomatoBasket tb = new TomatoBasket();
        EggBasket eb = new EggBasket();

        Corn corn = new Corn();
        cb.add(corn);

        foodCrate.put("Corn", cb);
        foodCrate.put("Tomato", tb);
        foodCrate.put("Egg", eb);

        int expected = 3;
        int actual = foodCrate.size();

        Assert.assertEquals(expected, actual);

    }
}

package com.zipcodewilmington.froilansfarm.Food_Tests;

import Food.Egg;
import Food.EggBasket;
import org.junit.Assert;
import org.junit.Test;

public class EggBasket_Test {
    @Test
    public void eggBasketConstructorTest() {
        EggBasket eb = new EggBasket();
        Egg egg = new Egg();
        Egg egg2 = new Egg();
        Egg egg3 = new Egg();
        eb.add(egg);
        eb.add(egg2);
        eb.add(egg3);

        int expected = 3;
        int actual = eb.size();

        Assert.assertEquals(expected, actual);

    }
}

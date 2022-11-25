package com.zipcodewilmington.froilansfarm.Food_Tests;


import Crop.TomatoPlant;
import Food.Tomato;
import Food.TomatoBasket;
import org.junit.Assert;
import org.junit.Test;

public class TomatoBasket_Test {
    @Test
    public void tomatoBasketConstructorTest() {
        TomatoBasket tb = new TomatoBasket();
        Tomato tomato = new Tomato();
        Tomato tomato2 = new Tomato();
        Tomato tomato3 = new Tomato();
        tb.add(tomato);
        tb.add(tomato2);
        tb.add(tomato3);


        int expected = 3;
        int actual = tb.size();

        Assert.assertEquals(expected, actual);

    }
}

package com.zipcodewilmington.froilansfarm.Food_Tests;

import Food.Corn;
import Food.CornBasket;
import org.junit.Assert;
import org.junit.Test;

public class CornBasket_Test {

    @Test
    public void cornBasketConstructorTest() {
        CornBasket cb = new CornBasket();
        Corn corn = new Corn();
        cb.add(corn);

        int expected = 1;
        int actual = cb.size();

        Assert.assertEquals(expected, actual);

    }
}

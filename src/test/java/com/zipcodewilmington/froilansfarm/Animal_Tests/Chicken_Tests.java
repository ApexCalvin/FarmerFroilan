package com.zipcodewilmington.froilansfarm.Animal_Tests;

import Animal.Chicken;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chicken_Tests {

    @Test
    public void isEdibleTest() {

    }

    @Test
    public void yieldTest() {

    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        String expected = "bok bok";
        String actual = chicken.makeNoise();
        assertEquals(expected, actual);

    }

}

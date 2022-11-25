package com.zipcodewilmington.froilansfarm.Animal_Tests;

import Animal.Chicken;
import Animal.Horse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Horse_Tests {

    @Test
    public void riddenTest() {

    }

    @Test
    public void isEdibleTest() {

    }

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        String expected = "neighhh";
        String actual = horse.makeNoise();
        assertEquals(expected, actual);
    }

}




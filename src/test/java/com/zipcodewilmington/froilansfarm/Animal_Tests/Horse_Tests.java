package com.zipcodewilmington.froilansfarm.Animal_Tests;

import Animal.Animal;
import Animal.Chicken;
import Animal.Horse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Horse_Tests {

    @Test
    public void getHorseNameTest() {
        Horse horse = new Horse();
        String expected = "brownie";
        horse.setName(expected);
        String actual = horse.getName();
        assertEquals(actual, expected);
    }

    @Test
    public void getHorseNameTest2() {
        Horse horse = new Horse("apple");
        String actual = horse.getName();
        String expected = "apple";
        assertEquals(actual, expected);
    }

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




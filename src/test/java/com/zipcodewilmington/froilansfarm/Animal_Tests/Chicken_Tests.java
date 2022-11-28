package com.zipcodewilmington.froilansfarm.Animal_Tests;

import Animal.Chicken;
import Animal.Horse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Chicken_Tests {
    @Test
    public void getChickenNameTest() {
        Chicken chicken = new Chicken();
        String expected = "chicken little";
        chicken.setName(expected);
        String actual = chicken.getName();
        assertEquals(actual, expected);
    }

    @Test
    public void getChickenNameTest2() {
        Chicken chicken = new Chicken("doodle");
        String actual = chicken.getName();
        String expected = "doodle";
        assertEquals(actual, expected);
    }
    @Test
    public void isEdibleTest() {

    }

    @Test
    public void yieldTest() {
        Chicken chicken = new Chicken();


    }

    @Test
    public void makeNoiseTest(){
        Chicken chicken = new Chicken();
        String expected = "bok bok";
        String actual = chicken.makeNoise();
        assertEquals(expected, actual);

    }

}

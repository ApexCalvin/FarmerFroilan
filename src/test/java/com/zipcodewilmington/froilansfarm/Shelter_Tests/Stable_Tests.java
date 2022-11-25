package com.zipcodewilmington.froilansfarm.Shelter_Tests;


import Animal.Horse;
import Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

public class Stable_Tests {
    @Test
    public void stableTest_Size1(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);
        int expected = 1;
        int actual = stable.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableTest_Size3(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        stable.add(horse);
        stable.add(horse2);
        stable.add(horse3);
        int expected = 3;
        int actual = stable.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableTest_HorseName3(){
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.add(horse);
        horse.setName("Bob");
        String expected = "Bob";
        String actual = stable.get(0).getName();


        Assert.assertEquals(expected, actual);
    }
}

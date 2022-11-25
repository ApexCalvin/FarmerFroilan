package com.zipcodewilmington.froilansfarm.Shelter_Tests;

import Animal.Chicken;
import Animal.Horse;
import Shelter.Shelter;
import org.junit.Assert;
import org.junit.Test;
import Shelter.FarmHouse;

public class Shelter_Tests {
    @Test
    public void shelterTest_Size1(){
        Shelter shelter = new Shelter();
        Horse horse = new Horse();
        shelter.add(horse);
        int expected = 1;
        int actual = shelter.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shelterTest_Size2(){
        Shelter shelter = new Shelter();
        Horse horse = new Horse();
        Chicken chicken = new Chicken();
        shelter.add(horse);
        shelter.add(chicken);
        int expected = 2;
        int actual = shelter.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shelterTest_Size3(){
        Shelter shelter = new Shelter();
        Horse horse = new Horse();
        Chicken chicken = new Chicken();
        FarmHouse farm = new FarmHouse();
        shelter.add(horse);
        shelter.add(chicken);
        shelter.add(farm);
        int expected = 3;
        int actual = shelter.size();

        Assert.assertEquals(expected, actual);
    }
}

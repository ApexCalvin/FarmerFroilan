package com.zipcodewilmington.froilansfarm.Person_Tests;

import Person.Farmer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Farmer_Tests {

    @Test
    public void farmerNameTest() {
        Farmer farmer = new Farmer("Froilan");
        String expected = "Froilan";
        String actual = farmer.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void farmerNameTest2() {
        Farmer farmer = new Farmer();
        String expected = "Froilan";
        farmer.setName(expected);
        String actual = farmer.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest() {
        Farmer farmer = new Farmer();
        String expected = "Hidy Hooo";
        String actual = farmer.makeNoise();
        assertEquals(expected, actual);
    }
}
package com.zipcodewilmington.froilansfarm.Person_Tests;

import Person.Pilot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pilot_Tests {


    @Test
    public void pilotNameTest() {
        Pilot pilot = new Pilot("Froilanda");
        String expected = "Froilanda";
        String actual = pilot.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void pilotNameTest2() {
        Pilot pilot = new Pilot();
        String expected = "Calvin";
        pilot.setName(expected);
        String actual = pilot.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void makeNoiseTest() {
        Pilot pilot = new Pilot();
        String expected = "Weeeee";
        String actual = pilot.makeNoise();
        assertEquals(expected, actual);
    }
}


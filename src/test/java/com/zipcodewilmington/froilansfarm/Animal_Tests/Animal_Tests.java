package com.zipcodewilmington.froilansfarm.Animal_Tests;

import Animal.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Animal_Tests {
    @Test
    public void getAnimalNameTest() {
        Animal animal = new Animal();
        String expected = "Rin";
        animal.setName(expected);
        String actual = animal.getName();
        assertEquals(actual, expected);
    }

    @Test
    public void getAnimalNameTest2() {
        Animal animal = new Animal("Figs");
        String actual = animal.getName();
        String expected = "Figs";
        assertEquals(actual, expected);
    }
}

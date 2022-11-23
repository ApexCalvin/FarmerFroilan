package com.zipcodewilmington.froilansfarm.Person_Tests;

import Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Person_Tests {
    @Test
    public void personNameTest() {
        Person person = new Person("John");
        String expected = "John";
        String actual = person.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void personNameTest2() {
        Person person = new Person();
        String expected = "Calvin";
        person.setName(expected);
        String actual = person.getName();
        assertEquals(expected, actual);
    }
}

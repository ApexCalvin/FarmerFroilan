package com.zipcodewilmington.froilansfarm.Shelter_Tests;

import Animal.Horse;
import Person.Person;
import Shelter.FarmHouse;
import Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouse_Tests {
    @Test
    public void farmHouseTest_Size1(){
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person();
        farmHouse.add(person);
        int expected = 1;
        int actual = farmHouse.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmHouseTest_Size2(){
        FarmHouse farmHouse = new FarmHouse();
        Person froilan = new Person();
        Person froilanda = new Person();
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
        int expected = 2;
        int actual = farmHouse.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void farmHouseTest_Name_Froilan(){
        FarmHouse farmHouse = new FarmHouse();
        Person froilan = new Person();
        Person froilanda = new Person();
        froilan.setName("Froilan");
        froilanda.setName("Froilanda");
        farmHouse.add(froilan);
        farmHouse.add(froilanda);

        String expected = "Froilan";
        String actual = farmHouse.get(0).getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void farmHouseTest_Name_Froilanda(){
        FarmHouse farmHouse = new FarmHouse();
        Person froilan = new Person();
        Person froilanda = new Person();
        froilan.setName("Froilan");
        froilanda.setName("Froilanda");
        farmHouse.add(froilan);
        farmHouse.add(froilanda);

        String expected = "Froilanda";
        String actual = farmHouse.get(1).getName();

        Assert.assertEquals(expected, actual);
    }
}

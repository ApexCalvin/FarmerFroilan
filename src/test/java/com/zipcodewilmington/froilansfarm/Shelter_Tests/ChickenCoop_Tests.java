package com.zipcodewilmington.froilansfarm.Shelter_Tests;

import Animal.Chicken;
import Shelter.ChickenCoop;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoop_Tests {
    @Test
    public void chickenCoopTest_Size1(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        coop.add(chicken);
        int expected = 1;
        int actual = coop.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenCoopTest_Size3(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        coop.add(chicken);
        coop.add(chicken2);
        coop.add(chicken3);
        int expected = 3;
        int actual = coop.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenCoopTest_Name(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        chicken2.setName("Henrietta");
        coop.add(chicken);
        coop.add(chicken2);
        String expected = "Henrietta";
        String actual = coop.get(1).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chickenCoopTest_NameNotEquals(){
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Chicken chicken2 = new Chicken();
        chicken.setName("Henrietta");
        coop.add(chicken);
        coop.add(chicken2);
        String expected = "Henrietta";
        String actual = coop.get(1).getName();

        Assert.assertNotEquals(expected, actual);
    }
}

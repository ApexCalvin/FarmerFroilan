package com.zipcodewilmington.froilansfarm.Shelter_Tests;

import FarmVehicle.FarmVehicle;
import Person.Person;
import Shelter.FarmHouse;
import Shelter.GiantVehicleGarage;
import org.junit.Assert;
import org.junit.Test;

public class GiantVehicleGarage_Tests {
    @Test
    public void giantVehicleGarage_Size1(){
        GiantVehicleGarage garage = new GiantVehicleGarage();
        FarmVehicle car = new FarmVehicle();
        garage.add(car);
        int expected = 1;
        int actual = garage.size();

        Assert.assertEquals(expected, actual);
    }

}

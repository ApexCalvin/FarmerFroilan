package com.zipcodewilmington.froilansfarm.Week_Tests;

import Animal.Chicken;
import Animal.Horse;
import Crop.CropRow;
import FarmVehicle.CropDuster;
import FarmVehicle.Tractor;
import Person.Farmer;
import Person.Pilot;
import Shelter.ChickenCoop;
import Shelter.Stable;
import org.junit.Test;

public class Sunday_Tests {
        Farmer froilan = new Farmer("froilan");
        Pilot froilanda = new Pilot("froilanda");

        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();

        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();


        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();


        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        CropDuster cd = new CropDuster();

    @Test
    public void horsesRiddenTest() {
        putChickensInCoop();

        for (int i = 0; i < 3; i++) {
            stable1.add(new Horse());
        }
        for (int i = 0; i < 3; i++) {
            stable2.add(new Horse());
        }
        for (int i = 0; i < 4; i++) {
            stable3.add(new Horse());
        }

    }

    public void putChickensInCoop() {
        for (int i = 0; i < 4; i++) {
            coop1.add(new Chicken());
        }
        for (int i = 0; i < 4; i++) {
            coop2.add(new Chicken());
        }
        for (int i = 0; i < 4; i++) {
            coop3.add(new Chicken());
        }
        for (int i = 0; i < 3; i++) {
            coop4.add(new Chicken());
        }
    }
}

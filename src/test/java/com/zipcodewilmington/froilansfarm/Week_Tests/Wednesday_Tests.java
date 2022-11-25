package com.zipcodewilmington.froilansfarm.Week_Tests;

import Animal.Horse;
import Person.Farmer;
import Person.Pilot;
import Shelter.FarmHouse;
import Shelter.Stable;
import org.junit.Test;

public class Wednesday_Tests {

    @Test
    public void rideHorseTest() {
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");

        FarmHouse fh = new FarmHouse();
        fh.add(froilan);
        fh.add(froilanda);

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        Horse horsey = new Horse();
        Horse fred = new Horse();
        Horse eugene = new Horse();
        Horse brownie = new Horse();
        Horse bob = new Horse();
        Horse gertrude = new Horse();
        Horse apple = new Horse();
        Horse seven = new Horse(); //8
        Horse henry = new Horse();
        Horse caroline = new Horse();

        stable1.add(horsey);
        stable1.add(fred);
        stable1.add(eugene);

        stable2.add(brownie);
        stable2.add(bob);
        stable2.add(gertrude);

        stable3.add(apple);
        stable3.add(seven);
        stable3.add(henry);
        stable3.add(caroline);

        horsey.setRidden();
    }
}

package com.zipcodewilmington.froilansfarm.Week_Tests;

import Animal.Horse;
import Person.Farmer;
import Person.Pilot;
import Shelter.FarmHouse;
import Shelter.Stable;
import com.sun.jdi.Value;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

        for(Horse horse : stable1) {
            horse.setRidden(froilan);
            //froilan.dismount(horse);
        }

        for(Horse horse : stable2) {
            horse.setRidden(froilanda);
            //froilanda.dismount(horse);
        }

        for(Horse horse : stable3) {
            horse.setRidden(froilan);
            //froilan.dismount(horse);
        }

        boolean allIsRidden = true;

        for(Horse horse : stable1) {
            if(horse.isRidden() == false) {
                allIsRidden = false;
            }
        }

        for(Horse horse : stable2) {
            if(horse.isRidden() == false) {
                allIsRidden = false;
            }
        }

        for(Horse horse : stable3) {
            if(horse.isRidden() == false) {
                allIsRidden = false;
            }
        }

        Assert.assertTrue(allIsRidden);
    }

    @Test
    public void feedHorsesTest() {
        //GET CORN
        //TODO - arraylist of cornstalk called CropRow
        //TODO - arraylist basket.add(froiland in tractor.harvest
        //TODO -    cornstalk, returning corn obj stored into basket

        //FEED HORSES
        //TODO - iterate through each stable(123), .remove(corn x3)
    }
    //He - 1 corn, 2 tomato, 5 egg
    //She - 2, 1, 2
    //total - 3, 3, 7
    public void feedpeople() {
        //TODO - create people
        //TODO - total food fields?  totalCorn = 3;
        //TODO - froilan.eat(corn);
        //TODO - create hashmap basket (Corn, CornArrayList)
        //TODO - Foodcrate, baskets

    }




}

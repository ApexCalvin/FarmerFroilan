package com.zipcodewilmington.froilansfarm.Week_Tests;

import Animal.Horse;
import Crop.Cornstalk;
import Crop.Crop;
import Crop.CropRow;
import Crop.TomatoPlant;
import FarmVehicle.CropDuster;
import FarmVehicle.Tractor;
import Food.Corn;
import Food.CornBasket;
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
    public void rideHorseTest2() {
        Farmer froilan = new Farmer("Froilan");

        Stable stable1 = new Stable();

        Horse horsey = new Horse();
        Horse fred = new Horse();
        Horse eugene = new Horse();

        stable1.add(horsey);
        stable1.add(fred);
        stable1.add(eugene);

        //if all horses are ridden, ridden value is true
        froilan.mount(horsey);
        froilan.dismount();
        froilan.mount(fred);
        froilan.dismount();
        froilan.mount(eugene);

        Boolean actual = eugene.isRidden();
        Assert.assertTrue(actual);
    }
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
//            horse.setRidden(froilan);
            froilan.mount(horse);
            froilan.dismount();
        }

        for(Horse horse : stable2) {
//            horse.setRidden(froilanda);
            froilanda.mount(horse);
            froilanda.dismount();
        }

        for(Horse horse : stable3) {
//            horse.setRidden(froilan);
            froilan.mount(horse);
            froilan.dismount();
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
    @Test
    public void fertilizeTest() {
        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        Cornstalk cornstalk = new Cornstalk();
        // Pilot does not have to ride Cropduster
        cropDuster.fertilize(cornstalk);
        boolean actual = cornstalk.getFertilized();
        Assert.assertTrue(actual);
    }
    @Test
    public void fertilizeTest2() {
        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropDuster.fertilize(tomatoPlant);
        boolean actual = tomatoPlant.getFertilized();
        Assert.assertTrue(actual);
    }
    @Test
    public void cropDusterRiddenTest() {
        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        pilot.mount(cropDuster);
        boolean actual = cropDuster.isRidden();
        Assert.assertTrue(actual);
    }
    @Test
    public void cropDusterRiddenTest2() {
        Pilot pilot = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        Cornstalk cornstalk = new Cornstalk();
        pilot.mount(cropDuster);
        cropDuster.fertilize(cornstalk);
        boolean actual = cornstalk.getFertilized();
        Assert.assertTrue(actual);
    }

    @Test
    public void harvestCropFlagTest(){
        Farmer farmer = new Farmer("Froiland");
        Tractor tractor = new Tractor();
        CropRow croprow = new CropRow();
        Cornstalk cornstalk1 = new Cornstalk();
        Cornstalk cornstalk2 = new Cornstalk();
        Cornstalk cornstalk3 = new Cornstalk();
        CornBasket cb = new CornBasket();
        croprow.add(cornstalk1);
        croprow.add(cornstalk2);
        croprow.add(cornstalk3);
        farmer.mount(tractor);
        /*for (Crop cs : croprow) {
            tractor.harvest(cs);
        }*/
        tractor.harvest(cornstalk1);
        Boolean actual = cornstalk1.getHarvested();
        Assert.assertTrue(actual);
    }

    @Test
    public void harvestCropTest(){
        Farmer farmer = new Farmer("Froiland");
        Tractor tractor = new Tractor();
        Cornstalk cornstalk = new Cornstalk();
        CornBasket cb = new CornBasket();
        farmer.mount(tractor);
        cb.add((Corn) tractor.harvest(cornstalk));
        int actual = cb.size();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}

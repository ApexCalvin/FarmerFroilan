package com.zipcodewilmington.froilansfarm;

import Animal.Chicken;
import Animal.Horse;
import Crop.*;
import FarmVehicle.CropDuster;
import FarmVehicle.Tractor;
import Food.*;
import Person.Farmer;
import Person.Pilot;
import Shelter.ChickenCoop;
import Shelter.Stable;
import org.w3c.dom.ls.LSOutput;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        System.out.println("Froilan Farm Morning Report: ");
        Farmer froilan = new Farmer("Froilan");
        //fix pilot :(
        Farmer froilanda = new Farmer("Froilanda");
        Pilot pilot = new Pilot("Froilanda");
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();

        CropDuster cropDuster = new CropDuster();

        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        Field field = new Field();
        field.add(cornRow);
        field.add(tomatoRow);


        for (int i = 0; i < 60; i++) {
            cornRow.add(new Cornstalk());
        }

        System.out.println("There are " + cornRow.size() + " corn stalks in the corn row.");

        for (int i = 0; i < 60; i++) {
            tomatoRow.add(new TomatoPlant());
        }

        System.out.println("There are " + tomatoRow.size() + " tomato plants in the tomato row.");

        ChickenCoop coop1 = new ChickenCoop();
        ChickenCoop coop2 = new ChickenCoop();
        ChickenCoop coop3 = new ChickenCoop();
        ChickenCoop coop4 = new ChickenCoop();

        for (int i = 0; i < 4; i++) {
            coop1.add(new Chicken());
        }
        System.out.println("There are " + coop1.size() + " chickens in coop 1");
        for (int i = 0; i < 4; i++) {
            coop2.add(new Chicken());
        }
        System.out.println("There are " + coop2.size() + " chickens in coop 2");
        for (int i = 0; i < 4; i++) {
            coop3.add(new Chicken());
        }
        System.out.println("There are " + coop3.size() + " chickens in coop 3");
        for (int i = 0; i < 3; i++) {
            coop4.add(new Chicken());
        }
        System.out.println("There are " + coop4.size() + " chickens in coop 4");

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        for (int i = 0; i < 3; i++) {
            stable1.add(new Horse());
        }
        System.out.println("There are " + stable1.size() + " horses in stable 1");
        for (int i = 0; i < 3; i++) {
            stable2.add(new Horse());
        }
        System.out.println("There are " + stable2.size() + " horses in stable 2");
        for (int i = 0; i < 4; i++) {
            stable3.add(new Horse());
        }
        System.out.println("There are " + stable3.size() + " horses in stable 3");

        for(Horse horse : stable1) {
            froilan.mount(horse);
            froilan.dismount();
        }

        for(Horse horse : stable2) {
            froilanda.mount(horse);
            froilanda.dismount();
        }

        for(Horse horse : stable3) {
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

        if(allIsRidden == true) {
            System.out.println("All horses have been ridden");
        } else if (allIsRidden == false) {
            System.out.println("All horses have not been ridden");
        }

        pilot.mount(cropDuster);

        for (int i = 0; i < field.size(); i++) {
            CropRow cropRowTemp = (CropRow) field.get(i);
            for (int j = 0; j < cropRowTemp.size(); j++) {
                Crop cropTemp = (Crop) cropRowTemp.get(j);
                cropDuster.fertilize(cropTemp);
            }
        }

        boolean allIsFertilized = true;

        for (int i = 0; i < field.size(); i++) {
            CropRow cropRowTemp = (CropRow) field.get(i);
            for (int j = 0; j < cropRowTemp.size(); j++) {
                Crop cropTemp = (Crop) cropRowTemp.get(j);
                if (cropTemp.getFertilized() == false) {
                    allIsFertilized = false;
                    break;
                }
            }
        }

        if (allIsFertilized == true) {
            System.out.println("All crop rows have been fertilized");
        } else if (allIsFertilized == true) {
            System.out.println("All crop rows have not been fertilized");
        }

        
        CornBasket cb = new CornBasket();
        froilan.mount(tractor1);
        CropRow cropRowTemp = (CropRow) field.get(0);
        for (int j = 0; j < cropRowTemp.size(); j++) {
            Crop cropTemp = (Crop) cropRowTemp.get(j);
            cb.add((Corn) tractor1.harvest(cropTemp));
        }

        System.out.println("There are " + cb.size() + " ears of corn in your corn basket");
        TomatoBasket tb = new TomatoBasket();
        CropRow cropRowTemp2 = (CropRow) field.get(1);
        for (int j = 0; j < cropRowTemp2.size(); j++) {
            Crop cropTemp = (Crop) cropRowTemp2.get(j);
            tb.add((Tomato) tractor1.harvest(cropTemp));
        }

        System.out.println("There are " + tb.size() + " tomatoes in your tomato basket");

        EggBasket eggBasket = new EggBasket();

        for(Chicken chicken : coop1) {
            chicken.fertilized();
            Egg egg = (Egg) chicken.yield();
            eggBasket.add(egg);
        }

        for(Chicken chicken : coop2) {
            chicken.fertilized();
            Egg egg = (Egg) chicken.yield();
            eggBasket.add(egg);
        }

        for(Chicken chicken : coop3) {
            chicken.fertilized();
            Egg egg = (Egg) chicken.yield();
            eggBasket.add(egg);
        }

        for(Chicken chicken : coop4) {
            chicken.fertilized();
            Egg egg = (Egg) chicken.yield();
            eggBasket.add(egg);
        }

        System.out.println("Egg basket has " + eggBasket.size() + " eggs");

        froilan.eat(cb, 1);
        froilan.eat(tb, 2);
        froilan.eat(eggBasket, 5);

        froilan.eat(cb, 2);
        froilan.eat(tb, 1);
        froilan.eat(eggBasket, 2);

        if (froilan.isFed() == true && froilanda.isFed() == true) {
            System.out.println("Froilan and Froilanda have eaten");
        } else {
            System.out.println("Froilan and Froilanda have not eaten");
        }

        System.out.println("There are " + cb.size() + " ears of corn in your corn basket");
        System.out.println("There are " + tb.size() + " tomatoes in your tomato basket");
        System.out.println("Egg basket has " + eggBasket.size() + " eggs");

        boolean allFed = true;
        for(Horse horse : stable1) {
            horse.eat(cb, 3);
            if(horse.isFed() == false) {
                allFed = false;
            }
        }

        for(Horse horse : stable2) {
            horse.eat(cb, 3);
            if(horse.isFed() == false) {
                allFed = false;
            }
        }

        for(Horse horse : stable3) {
            horse.eat(cb, 3);
            if(horse.isFed() == false) {
                allFed = false;
            }
        }
        if (allFed == true) {
            System.out.println("Horses have eaten");
        } else {
            System.out.println("Horses have not eaten");
        }

        System.out.println("There are " + cb.size() + " ears of corn in your corn basket");

    }
}

package com.zipcodewilmington.froilansfarm;

import Animal.Horse;
import Crop.Cornstalk;
import Crop.CropRow;
import Crop.Field;
import Crop.TomatoPlant;
import FarmVehicle.CropDuster;
import FarmVehicle.Tractor;
import Person.Farmer;
import Person.Pilot;
import Shelter.ChickenCoop;
import Shelter.Stable;

public class MorningRoutine {
    Farmer froilan = new Farmer("Froilan");
    Farmer froilanda = new Farmer("Froilanda");
    Pilot pilot = new Pilot("Froilanda");
    Tractor tractor1 = new Tractor();
    Tractor tractor2 = new Tractor();
    CropDuster cropDuster = new CropDuster();
    CropRow cornRow = new CropRow();
    CropRow tomatoRow = new CropRow();
    TomatoPlant tomatoPlant = new TomatoPlant();
    Cornstalk cornstalk = new Cornstalk();
    Field field = new Field();
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();

    public void addHorsesToStable() {
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
    }

    public void rideHorses() {
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
    }

    public void checkHorsesRidden() {
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
    }




}

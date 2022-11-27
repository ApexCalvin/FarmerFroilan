package Person;

import FarmVehicle.CropDuster;
import Food.Basket;
import Interfaces.Edible;
import Interfaces.Rideable;

public class Pilot extends Person {

    public boolean mounted = false;
    public Pilot(String name) {
        super(name);
    }

    public Pilot() {
    }

    public void eat(Basket basket, Edible edible) {}

    @Override
    public String makeNoise() {
        return "Weeeee";
    }
    @Override
    public void mount(Rideable ride) {
        ride.setRidden(this);
        CropDuster cd = (CropDuster) ride;
        cd.fly();
        mounted = true;
//        return true;
    }

    //Testing
}

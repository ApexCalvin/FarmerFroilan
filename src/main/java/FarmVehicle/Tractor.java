package FarmVehicle;

import Crop.Crop;
import Interfaces.Rider;
import Person.Farmer;

//public class Tractor extends FarmVehicle<Farmer> {
public class Tractor extends FarmVehicle {

    public Tractor() {
        super("");
    }

    public Tractor(String name) {
        super(name);
    }

    public void harvest(Crop crop) {

    }

    @Override
    public String makeNoise() { //change to String
        return "Chuga chuga...";

    }

    @Override
    public void setRidden() {

    }
}

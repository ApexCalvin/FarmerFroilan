package FarmVehicle;

import Crop.Crop;
import Interfaces.Edible;
import Interfaces.Rider;
import Person.Farmer;
import Person.Person;

//public class Tractor extends FarmVehicle<Farmer> {
public class Tractor extends FarmVehicle {

    boolean vehicleMounted = false;

    public Tractor() {
        super("");
    }

    public Tractor(String name) {
        super(name);
    }

    public Edible harvest(Crop crop) {
        if (vehicleMounted == true){
            return crop.yield();
        }
        return null;
    }

    @Override
    public String makeNoise() { //change to String
        return "Chuga chuga...";

    }

    @Override
    public void setRidden(Person person) {
        if(person.isMounted() == false){
            vehicleMounted = true;
        } else {
            vehicleMounted = false;
        }
    }

    @Override
    public boolean isRidden() { return vehicleMounted; }
}

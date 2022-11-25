package FarmVehicle;

import Interfaces.Aircraft;
import Interfaces.Rider;
import Person.Person;

//public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {
public class CropDuster extends FarmVehicle implements Aircraft {

    public CropDuster() {}

    public CropDuster(String name) {
        super(name);
    }

    @Override
    public String makeNoise() { //change to String
        return "Wub-wub wub-wub!";
    }

    @Override
    public void setRidden(Person person) {}

    @Override
    public boolean isRidden() { return (Boolean) null; }

    @Override
    public void fly() {}
}

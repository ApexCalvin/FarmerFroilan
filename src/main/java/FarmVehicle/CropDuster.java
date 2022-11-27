package FarmVehicle;

import Crop.Crop;
import Interfaces.Aircraft;
import Interfaces.Rider;
import Person.Person;

//public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {
public class CropDuster extends FarmVehicle implements Aircraft {
    public boolean ridden = false;
    public boolean flying = false;
    public CropDuster() {}

    public CropDuster(String name) {
        super(name);
    }

    @Override
    public String makeNoise() { //change to String
        return "Wub-wub wub-wub!";
    }

    @Override
    public void setRidden(Person person) {
        if (person.isMounted()== false) {
            ridden = true;
            fly();
        }else {
            ridden = false;
            landPlane();
        }
    }

    @Override
    public boolean isRidden() { return ridden; }
    public void fertilize(Crop crop) {
        if(ridden == true && flying == true) crop.setFertilizedTrue();
    }

    @Override
    public void fly() {
        flying = true;
    }

    public void landPlane() {
        flying = false;
    }

    public boolean getFly() {
        return flying;
    }

}

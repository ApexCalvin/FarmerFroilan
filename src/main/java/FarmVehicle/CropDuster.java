package FarmVehicle;

import Interfaces.Aircraft;
import Interfaces.Rider;

//public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {
public class CropDuster extends FarmVehicle implements Aircraft {

    public CropDuster() {
    }

    public CropDuster(String name) {
        super(name);
    }

    @Override
    public String makeNoise() { //change to String
        return "Wub-wub wub-wub!";
    }

    @Override
    public void setRidden() {
    }

    @Override
    public void fly() {

    }
}

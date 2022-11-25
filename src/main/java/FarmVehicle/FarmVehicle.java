package FarmVehicle;

import Interfaces.NoiseMaker;
import Interfaces.Rideable;
import Interfaces.Rider;
import Person.Person;

//public abstract class FarmVehicle<Rider extends Person> implements NoiseMaker, Rideable {
public class FarmVehicle<T extends Person> implements NoiseMaker, Rideable {

    String name;

    public FarmVehicle() {
        name = "";
    }

    public FarmVehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void operate() {

    }

    @Override
    public String makeNoise() { //change to String

        return "Vroom!";
    }

    @Override
    public void setRidden(Person person) {
    }
}

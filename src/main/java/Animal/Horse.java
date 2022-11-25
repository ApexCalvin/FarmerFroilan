package Animal;


import Interfaces.Eater;
import Interfaces.Rideable;
import Interfaces.Rider;
import Interfaces.Vegetables;

public class Horse extends Animal implements Rideable, Eater<Vegetables> {

    public boolean ridden = false;
    public Horse(String name) {
        super(name);
    }

    public Horse() {
    }

    @Override
    public void setRidden() {
        ridden = true;
    }


    @Override
    public String makeNoise() {
        super.makeNoise();
        return "neighhh";
    }

    @Override
    public void eat() {
        super.eat();
    }
}

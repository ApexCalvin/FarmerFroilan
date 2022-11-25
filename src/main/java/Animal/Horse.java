package Animal;


import Interfaces.Eater;
import Interfaces.Rideable;
import Interfaces.Rider;
import Interfaces.Vegetables;

public class Horse extends Animal implements Rideable, Eater<Vegetables> {
    @Override
    public Rider beRidden() {
        return null;
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

package Person;

import Interfaces.Botanist;
import Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {
    public Farmer(String name) {
        super(name);
    }

    public Farmer() {
    }

    @Override
    public void plantCrop() {

    }

    @Override
    public void mount() {

    }

    @Override
    public void dismount() {

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String makeNoise() {
        return "Hidy Hooo";
    }
}

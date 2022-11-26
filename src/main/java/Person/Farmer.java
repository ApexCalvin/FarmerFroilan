package Person;

import Interfaces.Botanist;
import Interfaces.Rideable;

public class Farmer extends Person implements Botanist {
    public boolean mounted = false;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() { }

    @Override
    public void plantCrop() { }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String makeNoise() {
        return "Hidy Hooo";
    }
}

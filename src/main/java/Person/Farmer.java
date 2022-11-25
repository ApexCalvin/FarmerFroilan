package Person;

import Interfaces.Botanist;
import Interfaces.Rideable;
import Interfaces.Rider;

public class Farmer extends Person implements Botanist {

    public boolean mounted = false;

    public Rideable ridingObject;
    public Farmer(String name) {
        super(name);
    }

    public Farmer() {
    }

    @Override
    public void plantCrop() {

    }

    @Override
    public boolean mount(Rideable ride) {
        ridingObject = ride;
        return true;
    }

    @Override
    public boolean dismount(Rideable ride) {
        ridingObject = null;
        return false;
    }

    public boolean isMounted() {
        return mounted;
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

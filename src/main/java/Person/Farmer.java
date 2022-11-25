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
    public boolean mount(Rideable ride) {
        mounted = true;
        return true; }

    @Override
    public void dismount(Rideable ride) { mounted = false; }

    public boolean isMounted() { return mounted; }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String makeNoise() {
        return "Hidy Hooo";
    }
}

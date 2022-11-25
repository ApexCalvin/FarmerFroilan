package Person;

import Interfaces.Rideable;

public class Pilot extends Person {

    public boolean mounted = false;
    public Pilot(String name) {
        super(name);
    }

    public Pilot() {
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String makeNoise() {
        return "Weeeee";
    }

    @Override
    public boolean mount(Rideable ride) {
            mounted = true;
            return true;
    }

    @Override
    public void dismount(Rideable ride) {}
}

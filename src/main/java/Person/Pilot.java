package Person;

import Interfaces.Rideable;
import Interfaces.Rider;

public class Pilot extends Person {
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

        return (Boolean) null;
    }

    @Override
    public boolean dismount(Rideable ride) {
        return (Boolean) null;
    }
}

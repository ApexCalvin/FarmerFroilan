package Person;

import Interfaces.Rider;

public class Pilot extends Person implements Rider {
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
    public void mount() {

    }

    @Override
    public void dismount() {

    }
}

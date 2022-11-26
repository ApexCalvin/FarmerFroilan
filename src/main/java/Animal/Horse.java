package Animal;


import Interfaces.Eater;
import Interfaces.Rideable;
import Interfaces.Vegetables;
import Person.Person;

public class Horse extends Animal implements Rideable, Eater<Vegetables> {
    public boolean ridden = false;

    public Horse(String name) {
        super(name);
    }

    public Horse() { }

    @Override
    public String makeNoise() {
        super.makeNoise();
        return "neighhh";
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void setRidden(Person person) {
        if (person.isMounted() == false) {
            ridden = true;
//            person.mount(this);
        } else {
            ridden = false;
//            person.dismount();
        }
//        person.mount(this);
//            ridden = person.isMounted();

    }

    public boolean isRidden() { return ridden; }
}

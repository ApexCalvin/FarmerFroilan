package Animal;


import Food.Basket;
import Interfaces.Eater;
import Interfaces.Edible;
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

    public void eat(Basket basket, Edible edible) {}

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

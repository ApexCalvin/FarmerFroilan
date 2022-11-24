package Shelter;

import Animal.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

//public class Shelter<T extends ArrayList<T>> {
public class Shelter<T extends Animal> implements Iterable{ //TODO: NOT ON THE UML!

    List<Object> shelter;


    public Shelter() {
        shelter = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(Object object) {
        shelter.add(object);
    }

    public Boolean contains(Object object) {
        return shelter.contains(object);
    }

    public void remove(Object object) {
        shelter.remove(object);
    }

    public Object get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(Object object) {
        return shelter.indexOf(object);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}

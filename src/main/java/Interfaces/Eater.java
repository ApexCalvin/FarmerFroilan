package Interfaces;

import Food.Basket;

import java.util.ArrayList;

public interface Eater<T extends Edible> {

    public void eat(Basket basket, int amount);

}

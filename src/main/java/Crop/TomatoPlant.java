package Crop;

import Food.Tomato;
import Interfaces.Edible;

public class TomatoPlant extends Crop<Tomato> {
    @Override
    public Edible yield() {
        return new Tomato();
    }
}

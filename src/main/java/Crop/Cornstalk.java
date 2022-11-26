package Crop;


import Food.Corn;
import Interfaces.Edible;

public class Cornstalk extends Crop<Corn> {
    @Override
    public Edible yield() {
        return new Corn();
    }
}

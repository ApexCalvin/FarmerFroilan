package Person;

import Crop.Crop;
import Crop.CropRow;
import Food.Basket;
import Interfaces.Botanist;
import Interfaces.Edible;

public class Farmer extends Person implements Botanist {
    public boolean mounted = false;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() { }

    public void eat(Basket basket, Edible edible) {}

    @Override
    public String makeNoise() {
        return "Hidy Hooo";
    }

    @Override
    public void plantCrop(CropRow cr, Crop crop) {
        cr.add(crop);
    }

}

package Person;

import Crop.Crop;
import Crop.CropRow;
import Interfaces.Botanist;

public class Farmer extends Person implements Botanist {
    public boolean mounted = false;

    public Farmer(String name) {
        super(name);
    }

    public Farmer() { }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String makeNoise() {
        return "Hidy Hooo";
    }

    @Override
    public void plantCrop(CropRow cr, Crop crop) {
        cr.add(crop);
    }
}

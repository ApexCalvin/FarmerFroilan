package Food;

import Interfaces.AnimalProduct;
import Interfaces.Edible;

public class Egg implements AnimalProduct {
    Boolean isEdible = false;
    @Override
    public boolean isEdible() {
        return false;
    }
}

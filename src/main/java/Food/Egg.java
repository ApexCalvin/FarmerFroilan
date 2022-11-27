package Food;

import Interfaces.AnimalProduct;
import Interfaces.Edible;

public class Egg implements AnimalProduct {
    Boolean isEdible = false;
    @Override
    public boolean isEdible() {
        return isEdible;
    }

    @Override
    public void fertilized() {
        isEdible = true;
    }
}

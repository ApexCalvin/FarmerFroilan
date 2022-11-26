package Food;

import Interfaces.Vegetables;

public class Corn implements Vegetables {
    public boolean edible = false;
    @Override
    public boolean isEdible() {
        return edible;
    }

    @Override
    public void fertilized() {
        edible = true;
    }
}

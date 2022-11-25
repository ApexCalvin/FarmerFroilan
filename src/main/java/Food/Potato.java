package Food;

import Interfaces.Vegetables;

public class Potato implements Vegetables {
    @Override
    public boolean isEdible() {
        return false;
    }
}

package Food;

import Interfaces.Vegetables;

public class Tomato implements Vegetables {
    @Override
    public boolean isEdible() {
        return false;
    }
}

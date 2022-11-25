package Crop;

import Interfaces.Edible;
import Interfaces.Produce;

//public class Crop <T extends Produce>{
public class Crop <T> implements Produce {
    public boolean hasBeenHarvested = false;
    public boolean hasBeenFertilized = false;
    public boolean getHarvested() {
        return hasBeenHarvested;
    }

    public void setHarvestToFalse() {
        hasBeenHarvested = false;
    }

    public void setHarvestToTrue() {
        hasBeenHarvested = true;
    }

    public void setFertilizedTrue() {
        hasBeenFertilized = true;
    }

    public boolean getFertilized() {
        return hasBeenFertilized;
    }

    public void setFertilizedFalse() {
        hasBeenFertilized = false;
    }

    @Override
    public boolean isEdible() {
        return false;
    }

    @Override
    public Edible yield() {
        return null;
    }
}

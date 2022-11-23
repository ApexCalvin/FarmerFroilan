package Crop;

import Interfaces.Produce;

public class Crop <T extends Produce>{
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
}

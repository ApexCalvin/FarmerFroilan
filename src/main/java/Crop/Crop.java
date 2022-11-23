package Crop;

import Interfaces.Produce;

public class Crop <T extends Produce>{
    public boolean hasBeenHarvested = false;
    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHarvestToFalse() {
        hasBeenHarvested = false;
    }

    public void setHarvestToTrue() {
        hasBeenHarvested = true;
    }
}

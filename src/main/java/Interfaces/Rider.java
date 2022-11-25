package Interfaces;

public interface Rider <T extends Rideable>{
    public boolean mount(Rideable ride);

    public boolean dismount(Rideable ride);
}

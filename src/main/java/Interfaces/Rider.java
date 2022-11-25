package Interfaces;

public interface Rider <T extends Rideable>{
    public boolean mount(Rideable ride);

    public void dismount(Rideable ride);

    public boolean isMounted();
}

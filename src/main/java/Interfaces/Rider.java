package Interfaces;

public interface Rider <T extends Rideable>{
    public void mount(Rideable ride);

    public void dismount();

    public boolean isMounted();
}

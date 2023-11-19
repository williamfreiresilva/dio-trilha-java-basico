package funcionalidades;

public interface iPod {
    public String[] playlist = new String[0];
    public String[] album = new String[0];
    public String[] artist = new String[0];
    public boolean widescreen = false;

    private void widescreen(){};
    private void forward(){};
    private void reverse(){};
    private void play(){};
    private void stop(){};
    private void increaseVolume(){};
    private void lowerVolume(){};
    private void select(){};
}

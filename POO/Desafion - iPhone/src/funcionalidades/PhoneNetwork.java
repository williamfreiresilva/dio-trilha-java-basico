package funcionalidades;

public interface PhoneNetwork {
    public String ssid = "";
    public String password = "";
    public boolean connected = true;
    public boolean wifiAvailable = false;
    public boolean gsmAvailable = true;

    private void connect(){};
    private void searchNetwork(){};
    private void autenticate(){};
    private void rememberNetwork(){};
}

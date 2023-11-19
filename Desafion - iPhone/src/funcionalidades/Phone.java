package funcionalidades;

public interface Phone {
    String[] recentCalls = new String[0];
    String[] ringtone = new String[0];
    
    private void answer(){};
    private void decline(){};
    private void mute(){};
    private void addContact(){};
    private void hold(){};
    private void speaker(){};
    private void mergeCalls(){};
    private void holdAnswer(){};
    private void endCall(){};
    private void keypad(){};    
}

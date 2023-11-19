package funcionalidades;

public interface Browser {
    String[] playlist = new String[0];
    String[] album = new String[0];
    String[] artist = new String[0];
    
    private void runUrl(){};
    private void refresh(){};
    private void newPage(){};
    private void bookmark(){};
     
} 
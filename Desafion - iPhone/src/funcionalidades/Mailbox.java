package funcionalidades;

public interface Mailbox {
    public String to = "";
    public String from = "";
    public String subject = "";
    public boolean newMessage = false; 

    private void send(){};
    private void read(){};
    private void delete(){};
    private void forward(){};
    private void respond(){};
}

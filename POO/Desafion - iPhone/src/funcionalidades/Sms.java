package funcionalidades;

public interface Sms {
   public String contact = "";
   public String number = "000000000000";
   public String dateTime = "";
   public boolean newMessage = false;

   private void send(){};
   private void read(){};
   private void delete(){};
}

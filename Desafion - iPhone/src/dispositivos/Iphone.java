package dispositivos;
import funcionalidades.*;

public class Iphone implements Browser, Contacts, GoogleMaps, iPod, Mailbox, Phone, PhoneNetwork, Sms{
        //Atributos da classe iPhone
        boolean home;
        boolean volumeUp = false;
        boolean volumeDown = false;
        boolean ring = false;
        boolean sleepWake = false;
        boolean sim = false;
        boolean screenOn = false;
        boolean ulocked = false;
        boolean widescreen = false;
        boolean jack = false;
        String userName = " ";
        String deviceName = " ";
        String phoneNumber = " ";   

        //Métodos da classe iPhone
        private void controleVolume(){};
        private void activateSilent(){};
        private void wake(){};
        private void verifySim(){};
        private void unlockScreen(){};
        private void verifyAccelerometer(){};
        private void verifyScreenSensor(){};
        private void activateJack(){};

    public static void main(String[] args) {

     

        Iphone myIphone = new Iphone();

        myIphone.home = false;
        myIphone.volumeUp = false;
        myIphone.volumeDown = false;
        myIphone.ring = false;
        myIphone.sleepWake = false;
        myIphone.sim = true;
        myIphone.screenOn = true;
        myIphone.ulocked = true;
        myIphone.widescreen = false;
        myIphone.jack = false;
        myIphone.userName = "JackDaniels";
        myIphone.deviceName = "Jack\' iPhone";
        myIphone.phoneNumber = "556145637824";   

     }
}

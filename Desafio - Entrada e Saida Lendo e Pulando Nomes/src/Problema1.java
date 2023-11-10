public class Problema1 {
    public static void main(String[] args) {
        
        String[] nomes = new String[10];
        nomes[0] = "UnB";
        nomes[1] = "UFMG";
        nomes[2] = "UNIFEI";
        nomes[3] = "UECE";
        nomes[4] = "UNICAMP";
        nomes[5] = "INATEL";
        nomes[6] = "UFRGS";
        nomes[7] = "UNIFESO";
        nomes[8] = "UFU";
        nomes[9] = "PUC";
      
        for(int i=0; i<10; i++) {
            if (i == 2 || i == 6 || i == 8)
                System.out.println(nomes[i]);
        }
    }
}
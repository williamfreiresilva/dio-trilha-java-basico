public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Modo break
        System.out.println("Modo - Break");
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                break;

        System.out.println(numero);
        }

        //Modo continue
         System.out.println("Modo - Continue");
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
                continue;

        System.out.println(numero);
        }
    }
}

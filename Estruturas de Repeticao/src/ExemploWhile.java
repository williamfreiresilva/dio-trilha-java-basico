import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            //adaptação para evitar valores negativos
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada.");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println("Alô !!!");
    }
    
    //método privado, acessível somente dentro da mesma classe
    //static, indica que partence à classe invés de ser uma instância
    //boolean, retorna verdadeiro ou falso
    private static boolean tocando(){
        //gera resultado aleatório entre 0 e 3
        //comparado ao valor 1, retorna verdadeiro ou falso
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        //retorna o valor inverso da variável
        return !atendeu;
    }
}
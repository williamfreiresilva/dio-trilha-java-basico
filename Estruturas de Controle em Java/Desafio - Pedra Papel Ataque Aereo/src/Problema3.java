import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;

        for (int i = 0; i < N; i++){
            jogador1 = leitor.next();
            jogador2 = leitor.next();

            /* 
             * Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.
             * Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
             * Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
             * Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
             * Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
             * Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
             */
            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Sem ganhador");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra")) System.out.println("Jogador 2 venceu");
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else System.out.println("Jogada inválida");
        }
    }
}

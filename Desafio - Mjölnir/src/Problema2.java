import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("\nInforme quantas pessoas: "); int C = leitor.nextInt();
		String nome;
		int N;
		String[] res;
		res = new String[C];


// TODO: complete os espaços em branco com sua solução para o problema

  		for (int i = 0; i < C; i++) {
  			System.out.println("\nInsira o nome do herói: "); nome = leitor.next();
			System.out.println("Insira a força do herói: "); N = leitor.nextInt();
  			if (nome.equals("Thor")) res[i] = nome + " - " + "Y";
			else res[i] = nome + " - " + "N";
		}
        leitor.close();
		for (String c : res)
			System.out.println(c);
		System.out.println("\n");
    }
}
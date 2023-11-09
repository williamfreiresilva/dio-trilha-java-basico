import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia,nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        ContaTerminal conta1 = new ContaTerminal();
        conta1.saldo = 237.48;

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        System.out.println("Agência: ");
        conta1.agencia = input.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        System.out.println("Conta: ");
        conta1.numero = input.nextInt();
       //correção para problema com a maneira que o Scanner lida com caractéres newline.
        input.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente !");
        System.out.println("Nome Cliente: ");
        conta1.nomeCliente = input.nextLine();
        input.close();
        

        String resposta = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",conta1.nomeCliente,conta1.agencia,conta1.numero,conta1.saldo);
        System.out.println(resposta);

    }
}

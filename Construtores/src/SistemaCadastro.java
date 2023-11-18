public class SistemaCadastro {
    public static void main(String[] args) {
        //Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("000.000.000-00","Marcos");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //Imprimindo dados do marcos
        System.out.println("Dados do usuário:");
        System.out.println("Nome: " + marcos.getNome());
        System.out.println("CPF: " + marcos.getCpf());
    }
}

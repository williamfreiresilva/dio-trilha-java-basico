public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("237650640");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            //resposta personalizado
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            //se o cep não tiver 8 caractéres, lança exceção
            throw new CepInvalidoException();

            //simulando um cep formatado
            return "23.765-064";
    }
}

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        //primeiro confirmar se esta conectado à internet
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        //depois de enviada, salvar o histórico da mensagem
        salvaHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado à internet");
    }
    private void salvaHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
package com.digibank;

/**
 * Agencia
 */
public class Agencia extends Digitalbank{

    public static int NUMERO_AGENCIA = 0;
    
    public Agencia(String endereco, String contato) {
        this.endereco = endereco;
        this.contato = contato;
        codigo = NUMERO_AGENCIA;
        NUMERO_AGENCIA++;
    }

    public Agencia() {
    }

    protected String endereco,contato;
    protected int codigo;

    protected void cadastrarCliente(){};
    protected void descadastrarCliente(){};
    protected void alterarCadastroCliente(){};

    protected void criarConta(){};
    protected void apagarConta(){};
    protected void alterarConta(){};
}

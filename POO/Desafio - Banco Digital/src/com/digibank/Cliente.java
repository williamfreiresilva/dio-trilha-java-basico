package com.digibank;
public class Cliente extends Agencia{

    protected String nome,sobrenome,cpf,rg,endereco,contato;
    public static int CODIGO_CLIENTE = 1;
    protected String [] tipo = {"PF", "PJ"};
    protected String tipoConta;

    public Cliente(String nome, String sobrenome, String cpf, String rg, String endereco, String contato, String tipo) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.contato = contato;
        setTipo(tipo);  
        CODIGO_CLIENTE++;
    }    

    public Cliente() {
    }

    private void setTipo(String tipo){
        tipo = tipo.toUpperCase();
        if(tipo.equals("PF")){
            tipoConta = this.tipo[0];
        } else if(tipo.equals("PJ")){
            tipoConta = this.tipo[1];
        }
    }
}

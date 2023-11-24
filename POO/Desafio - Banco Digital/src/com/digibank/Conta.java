package com.digibank;

import java.util.Arrays;

public class Conta extends Cliente {
    
    private static int NUMERO_CONTA = 1;

    protected int codigo;
    protected double saldo;
    protected String[] tipo = {"CORRENTE","POUPANCA"};
    protected String tipoConta;
    protected int codCliente;
    protected String[] extratos = {};

    public Conta(double saldo, String tipo, int codCliente) {
        super();
        this.codigo = NUMERO_CONTA;
        this.saldo = saldo;
        tipo = tipo.toUpperCase();
        setTipo(tipo);
        NUMERO_CONTA++;
        codCliente = Cliente.CODIGO_CLIENTE;
    }

    private void setTipo(String tipo){
        tipo = tipo.toUpperCase();
        if(tipo.equals("CORRENTE")){
            tipoConta = this.tipo[0];
        } else if(tipo.equals("POUPANCA")){
            tipoConta = this.tipo[1];
        }
    }

    public void sacar(double valor){
        this.saldo -= valor;
        
        String paraTexto = String.format("Saque realizado: %.2f", valor);
        this.extratos = Arrays.copyOf(this.extratos, this.extratos.length + 1);
        this.extratos[this.extratos.length - 1] = paraTexto;
    };
    public void depositar(double valor){
        this.saldo += valor;

        String paraTexto = String.format("Deposito realizado: %.2f", valor);
        this.extratos = Arrays.copyOf(this.extratos, this.extratos.length + 1);
        this.extratos[this.extratos.length - 1] = paraTexto;
    };
    public void transferir(double valor, Conta conta){
        sacar(valor);
        conta.depositar(valor);

        String paraTexto = String.format("Transferencia realizado: %.2f", valor);
        this.extratos = Arrays.copyOf(this.extratos, this.extratos.length + 1);
        this.extratos[this.extratos.length - 1] = paraTexto;
    };
    public void pagar(double valor, Conta conta){
        sacar(valor);
        transferir(valor,conta);

        String paraTexto = String.format("Pagamento realizado: %.2f", valor);
        this.extratos = Arrays.copyOf(this.extratos, this.extratos.length + 1);
        this.extratos[this.extratos.length - 1] = paraTexto;
    };
    public void imprimirSaldo(){
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    };
    public void imprimirExtrato(){
        System.out.println("========= EXTRATO =========");
        for(String extrato : this.extratos){
            System.out.println(extrato);
        }
        imprimirSaldo();
    };
}

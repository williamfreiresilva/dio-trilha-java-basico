package com.digibank;

public interface Main {
    public static void main(String[] args) {
        Agencia agencia000001 = new Agencia("QNE 17,LOTES 5/6 AV, Taguatinga Norte, Brasília - DF, 72125-170", "(61) 5003-4001");
        Cliente cliente000000001 = new Cliente("Marcelo", "Drumond", "000.000.000-01", "5467-847", "Taguatinga Sul, Brasília - DF", "(61) 98888-9888", "PF");
        Conta conta0000000001 = new Conta(100.0,"corrente",Cliente.CODIGO_CLIENTE);

        conta0000000001.depositar(100.00);
        conta0000000001.depositar(100.00);
        conta0000000001.sacar(50.00);
        conta0000000001.depositar(100.00);
        conta0000000001.imprimirSaldo();
        conta0000000001.imprimirExtrato();
    }
}

package com.projetono;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteudo: no1");
        No no2 = new No("Conteudo: no2");
        no1.setProximNo(no2);

        No no3 = new No("Conteudo: no3");
        no2.setProximNo(no3);

        No no4 = new No("Conteudo: no4");
        no3.setProximNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximNo());
        System.out.println(no1.getProximNo().getProximNo());
        System.out.println(no1.getProximNo().getProximNo().getProximNo());
        System.out.println(no1.getProximNo().getProximNo().getProximNo().getProximNo());
    }
}

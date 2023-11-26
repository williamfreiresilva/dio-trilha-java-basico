package com.projetono;

public class No<T> {
    
    private T conteudo;
    private No<T> proximNo;

    public No(T conteudo){
        this.proximNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    } 
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public No<T> getProximNo() {
        return proximNo;
    } 
    public void setProximNo(No<T> proximNo) {
        this.proximNo = proximNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo= '" + conteudo + "\'" +
                "}";
    }
}

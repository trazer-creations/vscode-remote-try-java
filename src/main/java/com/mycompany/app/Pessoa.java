package com.mycompany.app;

public class Pessoa {
    private String nome;
    protected Livro[] listaLivros;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Livro[] getLivros(){
        return listaLivros;
    }

    public void setLivros(Livro[] listaLivros){
        this.listaLivros = listaLivros;
    }
}
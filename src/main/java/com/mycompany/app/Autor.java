package com.mycompany.app;

public class Autor extends Pessoa {
    private String nacionalidade;

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private Livro[] obrasPublicadas;

    public Livro[] getObrasPublicadas(){
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] livro){
        this.obrasPublicadas = livro;
    }
}
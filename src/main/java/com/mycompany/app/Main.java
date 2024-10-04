package com.mycompany.app;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Autor autor = new Autor();
        autor.setNome("Alysson Faria");
        autor.setNacionalidade("Brasileiro");


        Livro livro = new Livro();
        livro.setTitulo("Java for Begginers");
        livro.setGenero("Tecnologia");
        livro.setAutor(autor);
        livro.validarDisponibilidade();

        Usuario usuario = new Usuario();
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
    }
}
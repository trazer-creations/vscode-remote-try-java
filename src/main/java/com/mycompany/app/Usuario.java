package com.mycompany.app;

public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Emprestimo[] getHistoricoEmprestimos(){
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(Emprestimo[] emprestimo){
        this.historicoEmprestimos = emprestimo;
    }
}
package br.unama.praca;

public class Pessoa {
    private String nome;
    private String cpf;


    public void pular(){
        System.out.println("pulando");
    }
    public void correr(){
        System.out.println("Correndo");
    }

 //Pessoa
    public Pessoa(){
        this.nome = "";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
}


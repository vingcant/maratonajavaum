package javacore.heranca.domain;

import java.sql.SQLOutput;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro Bloco Static pEssoa");
    }
    {
        System.out.println("Bloco normal ");
    }
    {
        System.out.println("Bloco normal 2");
    }
    public Pessoa (String nome){
        System.out.println("Dentro do const Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

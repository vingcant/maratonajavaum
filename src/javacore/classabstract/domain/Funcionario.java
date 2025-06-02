package javacore.classabstract.domain;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcula();
    }

    public abstract void calcula();


    @Override
    public String toString(){
        return "Funcionario: "+this.nome+"\nSalario: "+this.salario;
    }
}

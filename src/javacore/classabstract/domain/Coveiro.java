package javacore.classabstract.domain;

public class Coveiro extends Funcionario {

    public Coveiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcula(){
        this.salario = this.salario + this.salario * 0.5;
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome+"\nSalario: "+this.salario;
    }
}

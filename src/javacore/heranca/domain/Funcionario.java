package javacore.heranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro Bloco Static funcionario");
    }
    {
        System.out.println("Bloco normal ");
    }
    {
        System.out.println("Bloco normal 2");
    }


    public Funcionario (String nome){
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

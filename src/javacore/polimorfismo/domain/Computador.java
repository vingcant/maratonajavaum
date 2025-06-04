package javacore.polimorfismo.domain;

public class Computador extends Produto {
    public static final double VALOR_IMPOSTO = 0.5;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do "+this.nome);
       return this.valor * VALOR_IMPOSTO;
    }


}

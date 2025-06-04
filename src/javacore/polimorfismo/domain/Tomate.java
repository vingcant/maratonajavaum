package javacore.polimorfismo.domain;

public class Tomate extends Produto{
    public static final double VALOR_IMPOSTO = 0.05;
    protected String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do "+this.nome);
        return this.valor * VALOR_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}

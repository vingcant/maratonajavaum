package javacore.modificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    @Override
    public final String toString(){
        return "Nome: "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

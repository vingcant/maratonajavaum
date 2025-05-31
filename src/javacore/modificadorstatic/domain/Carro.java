package javacore.modificadorstatic.domain;

public class Carro {
    private String marca;
    private double velocidadeMax;
    private static double velocidadeLimite = 250;

    //Modificador statico altera o atributo para não pertencer ao objeto, mas a classe em si

    public Carro(String marca, double velocidadeMax) {
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Nome da Marca: " + this.marca);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }


    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}

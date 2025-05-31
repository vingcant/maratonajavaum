package javacore.modificadorstatic.test;

import javacore.modificadorstatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("Yamaha", 280);
        Carro c2 = new Carro("Subaru", 270);
        Carro c3 = new Carro("Ferrari", 260);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}

package javacore.modificadorfinal.test;

import javacore.modificadorfinal.domain.Carro;
import javacore.modificadorfinal.domain.Subaru;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Paulk");
        System.out.println(carro.COMPRADOR);
        //detalhe: acessar variaveis estaticas atraves de instancias não é aconselhado
        Subaru subaru = new Subaru();
        subaru.setNome("Paulw");
        System.out.println(subaru);

    }
}

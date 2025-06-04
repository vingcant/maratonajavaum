package javacore.polimorfismo.test;

import javacore.polimorfismo.reposit.Estatistica;
import javacore.polimorfismo.servico.Assist;
import javacore.polimorfismo.servico.Gol;

public class TestInterface {
    public static void main(String[] args) {
        Estatistica estatistica = new Gol();
        estatistica.alterar();
    }
}

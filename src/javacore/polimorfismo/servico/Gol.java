package javacore.polimorfismo.servico;

import javacore.polimorfismo.reposit.Estatistica;

public class Gol implements Estatistica {

    @Override
    public void alterar() {
        System.out.println("Gols");
    }
}

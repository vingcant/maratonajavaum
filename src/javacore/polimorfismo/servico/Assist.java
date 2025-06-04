package javacore.polimorfismo.servico;

import javacore.polimorfismo.reposit.Estatistica;

public class Assist implements Estatistica {
    @Override
    public void alterar(){
        System.out.println("Assistencia");
    }
}

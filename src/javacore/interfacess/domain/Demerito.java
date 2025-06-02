package javacore.interfacess.domain;

public class Demerito implements Gols, Assistencias{
    public void gols(){
        System.out.println("Menos de 2 por partida (como eh possivel?)");
    }

    @Override
    public void assistencia(){
        System.out.println("0 assistencias");
    }

}

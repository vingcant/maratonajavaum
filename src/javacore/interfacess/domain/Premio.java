package javacore.interfacess.domain;

public class Premio implements Gols, Assistencias{

    @Override
    public void gols(){
        System.out.println("Mais de 100 gols");
    }

    @Override
    public void assistencia(){
        System.out.println("210 assistencias");
    }

    @Override
    public void chancePerdida(){
        System.out.println("Nenhuma chance perdida!");
    }

}

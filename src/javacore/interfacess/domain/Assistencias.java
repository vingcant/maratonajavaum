package javacore.interfacess.domain;

public interface Assistencias {
    void assistencia();

    default void chancePerdida(){
        System.out.println("Muitas chances perdidas.");
    }
}

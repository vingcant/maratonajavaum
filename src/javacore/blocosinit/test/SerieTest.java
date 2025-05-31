package javacore.blocosinit.test;

import javacore.blocosinit.domain.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();

        for (int ep : serie.getEps()){
            System.out.print(ep + " ");
        }

    }
}

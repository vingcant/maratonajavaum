package javacore.blocosinit.domain;

public class Serie {
    private String nome;
    private int[] eps;

    {
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps [i] = i +1;
        }
    }

    public Serie (String nome){
        this.nome = nome;
    }

    public Serie(){
        for(int ep : this.eps){
            System.out.print(ep + " ");
        }
    }

    public int[] getEps() {
        return eps;
    }
}

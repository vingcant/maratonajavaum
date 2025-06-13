package javacore.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "k";
        String nome2 = "kk";

        nome = nome.concat("kk");// == nome+="kk"

        String nome3 = new String("KKKK");

        System.out.println(nome == nome3);//comparação = false porque nome e nome3 estão em locais diferentes
        System.out.println(nome == nome3.intern());//nome3 agora referencia o mesmo lugar da pool de nome
    }
}

package javacore.regularexpression.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "Jolyne, Jotaro, Johnny";
        String[] split = text.split(",");
        for (String nome : split){
            System.out.println(nome.trim());
        }

    }
}

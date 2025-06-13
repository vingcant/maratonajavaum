package javacore.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Kkkkk";
        nome.concat("KKK");

        StringBuilder sb = new StringBuilder("Paulx");
        sb.append(" Xaiç"); //
        System.out.println(sb);
    }
}

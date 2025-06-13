package javacore.String.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  k";
        String num = "012345";

        System.out.println(nome.charAt(2));
        System.out.println(nome.length());
        System.out.println(nome.replace("k", "p"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.length());
        System.out.println(num.substring(2,5));
        System.out.println(nome.trim());

    }
}

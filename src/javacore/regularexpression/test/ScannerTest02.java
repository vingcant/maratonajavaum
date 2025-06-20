package javacore.regularexpression.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Jolyne, Jotaro, Johnny";
        Scanner input = new Scanner(text);
        input.useDelimiter(",");

        while (input.hasNext()){
            System.out.println(input.next().trim());
        }

    }
}

package exercicios.domain;

import java.util.Scanner;

public class FindNumInt {
    Scanner input = new Scanner(System.in);


    public void exibir() {
        System.out.print("Insira um número inteiro: ");
        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println("O número digitado foi: " + num);
            if (num % 2 == 0) {
                System.out.println("O número " + num + " é par");
            } else {
                System.out.println("O número " + num + " é ímpar");
            }
        }else{
            System.out.println("O número digitado não foi um inteiro.");
        }
    }
}

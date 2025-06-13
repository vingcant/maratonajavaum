package javacore.exception.exception.test;

import javacore.exception.exception.domain.InvalidNameException;

import java.util.Scanner;

public class InvalidNameExceptionTest01 {
    public static void main(String[] args) {
        try {
            nameEntry();
        }catch (InvalidNameException e){
            e.printStackTrace();
        }
    }

    public static void nameEntry() throws InvalidNameException {
        Scanner input = new Scanner(System.in);
        String userName = "Paulo";
        System.out.println("User: ");
        String userNameIn = input.next();
        if (!userNameIn.equals(userName)){
            throw new InvalidNameException();
        }
        System.out.println("Sucess login");
    }
}

package javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        newFile();
    }

    private static void newFile(){
        File file = new File("archive\\test.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(created+" criado");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

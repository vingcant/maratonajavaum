package javacore.exception.exception.test;

import javacore.exception.exception.domain.Reader1;
import javacore.exception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        read();

    }

    public static void read(){
        try (Reader1 reader1 = new Reader1();
             Reader2 reader2 = new Reader2()){
//Os objetos são chamados na ordem inversa: 2 > 1
        }catch (IOException e){
         e.printStackTrace();
        }
    }
}

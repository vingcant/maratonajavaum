package javacore.io.test;

import java.io.*;

public class BufferedReader01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String take;
            while ((take = br.readLine()) != null){
                System.out.println(take);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

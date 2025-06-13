package javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new Exception();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index");
        }catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            maybeException();
        }catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }

    private static void maybeException() throws SQLException, IOException{
    }
}

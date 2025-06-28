package javacore.exception.exception.domain;


public class InvalidNameException extends Exception{

    public InvalidNameException(){
        super("Invalid username");
    }


    public InvalidNameException(String message){
        super(message);
    }
}

package javacore.exception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursive();
    }
    public static void recursive(){
        recursive();
    }
}

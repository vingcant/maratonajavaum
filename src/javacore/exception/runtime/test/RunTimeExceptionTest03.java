package javacore.exception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        connection();
    }

    private static void connection() {
        try {
            System.out.println("Por dentro");
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Por fora");
        }
    }
}

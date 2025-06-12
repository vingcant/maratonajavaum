package javacore.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        division(1,0);

    }

    /**
     *
     * @param a
     * @param b
     * @return
     * @throws IllegalArgumentException b = zero
     */
    private static int division(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento inválido, b não pode ser 0");
        }
        return a/b;
    }
}

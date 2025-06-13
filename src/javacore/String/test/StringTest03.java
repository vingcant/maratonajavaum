package javacore.String.test;

public class StringTest03 {
    public static void main(String[] args) {
        long init = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long end = System.currentTimeMillis();
        System.out.println((end - init)+"ms");
    }

    private static void concatStringBuilder(int weight){
        StringBuilder txt = new StringBuilder(weight);
        for (int i = 0; i < weight; i++) {
            txt.append(i);
        }
    }
}

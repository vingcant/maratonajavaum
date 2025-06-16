package exercicios.test;

public class ArrayQuadrado {
    public static void main(String[] args) {
        
        xQuadrado();


    }

    public static void xQuadrado(){
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < num.length; i++) {
            int calculo = num[i]*num[i];
            System.out.println(calculo);
        }
    }
}

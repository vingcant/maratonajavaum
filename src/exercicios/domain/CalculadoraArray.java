package exercicios.domain;

public class CalculadoraArray {
    // calculadora que recebe lista de array e retorna a lista x2
    public int[] numeros = {1,2,3,4};

    public int[] exibir(){
        for (int i = 0; i < this.numeros.length; i++) {
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        } return numeros;
    }
}

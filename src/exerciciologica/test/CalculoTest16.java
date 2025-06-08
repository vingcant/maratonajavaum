package exerciciologica.test;

import exerciciologica.servico.Triangulo;

public class CalculoTest16 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.setA(1);
        triangulo.setB(4);
        triangulo.setC(1);

        triangulo.calcular();
    }
}

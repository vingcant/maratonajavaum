package exerciciologica.test;

import exerciciologica.servico.CalcularLogica;

public class CalculoTest01 {
    public static void main(String[] args) {
        CalcularLogica calcularLogica = new CalcularLogica();

        calcularLogica.setA(2);
        calcularLogica.setB(0);
        calcularLogica.setC(3);

        calcularLogica.calcular();

    }
}

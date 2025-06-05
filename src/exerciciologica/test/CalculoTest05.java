package exerciciologica.test;

import exerciciologica.servico.SalarioLogica;

public class CalculoTest05 {
    public static void main(String[] args) {
        SalarioLogica salarioLogica = new SalarioLogica();

        salarioLogica.setA(6000.0);
        salarioLogica.calcular();

    }
}

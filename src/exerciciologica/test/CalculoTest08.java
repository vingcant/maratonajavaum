package exerciciologica.test;

import exerciciologica.servico.ValorDecrescente;

public class CalculoTest08 {
    public static void main(String[] args) {
        ValorDecrescente valor = new ValorDecrescente();
        valor.setA(20);
        valor.setB(10);
        valor.setC(50);

        valor.calcular();

    }
}

package exerciciologica.test;

import exerciciologica.servico.ValorDivisao;

public class CalculoTest22 {
    public static void main(String[] args) {
        ValorDivisao valorDivisao = new ValorDivisao();

        valorDivisao.setA(10);
        valorDivisao.setB(2);
        valorDivisao.calcular();
    }
}

package exerciciologica.test;

import exerciciologica.servico.TrocaValores;

public class CalculoTest14 {
    public static void main(String[] args) {
        TrocaValores troca = new TrocaValores();

        troca.setA(5);
        troca.setB(2);
        troca.calcular();
    }
}

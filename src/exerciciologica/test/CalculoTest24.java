package exerciciologica.test;

import exerciciologica.servico.Viagem;

public class CalculoTest24 {
    public static void main(String[] args) {
        Viagem viagem = new Viagem();
        viagem.setA(500);
        viagem.setB(150);

        viagem.calcular();
    }
}

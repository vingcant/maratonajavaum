package exerciciologica.test;

import exerciciologica.servico.LeituraNota;

public class CalculoTest10 {
    public static void main(String[] args) {
        LeituraNota media = new LeituraNota();
        int[] notas = {10, 10, 5};

        media.setNotas(notas);

        media.calcular();
    }
}

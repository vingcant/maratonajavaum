package exerciciologica.test;

import exerciciologica.servico.LeituraMedia;

public class CalculoTest11 {
    public static void main(String[] args) {
        LeituraMedia media = new LeituraMedia();
        int[] notas = {10, 5, 8, 4};
        media.setNome("Paulq");

        media.setNotas(notas);

        media.calcular();
    }
}

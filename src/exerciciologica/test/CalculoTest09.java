package exerciciologica.test;

import exerciciologica.servico.ImCalculo;

public class CalculoTest09 {
    public static void main(String[] args) {
        ImCalculo imc = new ImCalculo();

        imc.setPeso(75);
        imc.setAltura(1.78);
        imc.calcular();
    }
}

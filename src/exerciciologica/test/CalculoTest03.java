package exerciciologica.test;

import exerciciologica.servico.AdditionMult;

public class CalculoTest03 {
    public static void main(String[] args) {
        AdditionMult addmult = new AdditionMult();

        addmult.setA(5);
        addmult.setB(4);

        addmult.calcular();
    }
}

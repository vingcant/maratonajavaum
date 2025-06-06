package exerciciologica.test;

import exerciciologica.servico.AnoNascimento;
import exerciciologica.servico.PessoaIdade;

public class CalculoTest15 {
    public static void main(String[] args) {
        AnoNascimento anoNasc = new AnoNascimento();

        anoNasc.setA(2010);
        anoNasc.setB(5);
        anoNasc.setC(14);

        anoNasc.calcular();
    }
}

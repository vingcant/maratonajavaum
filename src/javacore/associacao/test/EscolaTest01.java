package javacore.associacao.test;

import javacore.associacao.dominio.Escola;
import javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Paulx");
        Professor professor2 = new Professor("Paulz");
        Professor [] professores = {professor, professor2};
        Escola escola = new Escola("Amari", professores);

        escola.imprime();
    }
}

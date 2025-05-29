package javacore.associacao.test;

import javacore.associacao.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paulo");
        Pessoa p2 = new Pessoa("Paule");
        Pessoa p3 = new Pessoa("Pauli");
        Pessoa[] pessoas = {p1, p2, p3};
        for(Pessoa person : pessoas){
            person.imprime();
        }

    }
}

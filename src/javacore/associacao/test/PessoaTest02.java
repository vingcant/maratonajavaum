package javacore.associacao.test;

import javacore.associacao.dominio.Emprego;
import javacore.associacao.dominio.Pessoa;

public class PessoaTest02 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Paulu");
        Emprego emprego = new Emprego("Mercado");
        p1.setEmprego(emprego);
        p1.imprime();

        //Se não houver um if na classe Pessoa indicando que caso emprego != null não haja a necessidade
        //de rodar, acontecerá um null pointer pela inexistencia do objeto; isso numa situacao em que
        //o setEmprego venha depois do imprime
    }
}

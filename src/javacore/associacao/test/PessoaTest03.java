package javacore.associacao.test;

import javacore.associacao.dominio.Emprego;
import javacore.associacao.dominio.Pessoa;

public class PessoaTest03 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pauls");
        Pessoa pessoa2 = new Pessoa("Pault");
        Emprego emprego = new Emprego("Varejo");
        Pessoa [] pessoas = {pessoa, pessoa2};

        pessoa.setEmprego(emprego);
        pessoa2.setEmprego(emprego);
        emprego.setPessoa(pessoas);

        System.out.println("---Pessoas----");
        pessoa.imprime();
        System.out.println("---Empregos----");
        emprego.imprime();
     }
}

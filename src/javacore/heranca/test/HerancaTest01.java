package javacore.heranca.test;

import javacore.heranca.domain.Endereco;
import javacore.heranca.domain.Funcionario;
import javacore.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua string");
        endereco.setCep("15154");
        Pessoa pessoa = new Pessoa("Paulx");
        pessoa.setCpf("5454552");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("--------");

        Funcionario funcionario = new Funcionario("Fault");
        funcionario.setCpf("151515151");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(412200);

        funcionario.imprime();

    }
}

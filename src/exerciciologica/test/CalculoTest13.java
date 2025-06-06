package exerciciologica.test;

import exerciciologica.servico.PessoaIdade;

public class CalculoTest13 {
    public static void main(String[] args) {
        PessoaIdade pessoa = new PessoaIdade();
        pessoa.setA(18);
        pessoa.setNome("Paulq");
        pessoa.calcular();
    }
}

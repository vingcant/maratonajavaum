package exerciciologica.test;

import exerciciologica.domain.Produto;
import exerciciologica.servico.FormaDPagamento;
import exerciciologica.servico.LeituraProduto;
import exerciciologica.servico.MetodoPagamento;

public class CalculoTest12 {
    public static void main(String[] args) {
        FormaDPagamento payment = new FormaDPagamento();
        MetodoPagamento metodo = new MetodoPagamento();
        LeituraProduto lerProduto = new LeituraProduto();

        lerProduto.ler();
        payment.setA(1);
        payment.calcular();
        metodo.setB(3);
        metodo.calcular();
    }
}

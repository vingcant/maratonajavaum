package javacore.polimorfismo.test;

import javacore.polimorfismo.domain.Computador;
import javacore.polimorfismo.domain.Produto;
import javacore.polimorfismo.domain.Tomate;
import javacore.polimorfismo.servico.CalculaImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Computador("AMD", 865);
        CalculaImposto.calculaImposto(produto);
        System.out.println("-----");
        Tomate produtoDois = new Tomate("Ittaliete", 5);
        produtoDois.setDataValidade("11/05/4000");

        CalculaImposto.calculaImposto(produtoDois);


    }
}

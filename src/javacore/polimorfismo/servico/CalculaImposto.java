package javacore.polimorfismo.servico;

import javacore.polimorfismo.domain.Computador;
import javacore.polimorfismo.domain.Produto;
import javacore.polimorfismo.domain.Tomate;

public class CalculaImposto {

    public static void calculaImposto(Produto produto){
        System.out.println("Relatorio do imposto: ");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        System.out.println("Imposto: "+imposto);
        if(produto instanceof Tomate){
            Tomate produtoDois= (Tomate) produto;
            System.out.println(produtoDois.getDataValidade());
        }
    }
}

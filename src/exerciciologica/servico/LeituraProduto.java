package exerciciologica.servico;

import exerciciologica.domain.Produto;

public class LeituraProduto extends Produto {


    public void ler(){
        System.out.print("Escolha um dos produtos a seguir: ");
        System.out.println("1 para Batata Cozida e 2 para Batata Frita");
    }


}

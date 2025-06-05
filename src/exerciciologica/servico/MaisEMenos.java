package exerciciologica.servico;

import exerciciologica.domain.Base;

public class MaisEMenos extends Base {
//    int base = a;

    //Aqui tem um caso curioso sobre a inicialização: se eu colocar a logica antes do metodo, a variavel
    //base vai ser atribuida como o valor 0 do int A. Mais detalhes depois...

    @Override
    public void calcular(){
        int base = this.getA();
        System.out.println("O número é: "+base);
        System.out.println("Seu antecessor é: "+(base - 1));
        System.out.println("Seu sucessor é: "+(base +1));
    }
}

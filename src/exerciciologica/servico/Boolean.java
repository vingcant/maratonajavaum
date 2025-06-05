package exerciciologica.servico;

import exerciciologica.domain.Base;

public class Boolean extends Base {
    int base = this.getA();
    int baseDois = this.getB();

    @Override
    public void calcular(){
        if (base != baseDois){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}

package exerciciologica.servico;

import exerciciologica.domain.Base;

public class LogicaBolean extends Base {

    @Override
    public void calcular(){
        int base = this.getA();
        int baseDois = this.getB();
        if (base != baseDois){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
    }
}

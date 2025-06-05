package exerciciologica.servico;

import exerciciologica.domain.Base;

public class LeituraValor extends Base {

    @Override
    public void calcular(){
        System.out.println("Valor: "+this.getA());
        System.out.println("----");
        System.out.println("Valor att: "+(this.getA()+this.getA()*0.05));
        System.out.println("Valor att: "+(this.getA()-this.getA()*0.05));
        System.out.println("Valor att: "+(this.getA()*0.05));
    }
}

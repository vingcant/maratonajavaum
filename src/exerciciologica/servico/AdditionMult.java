package exerciciologica.servico;

import exerciciologica.domain.Base;

public class AdditionMult extends Base {
    int base = c;

    @Override
    public void calcular(){
        if(this.getA() == this.getB() && this.getB() == this.getA() ){
            System.out.println(base = this.getA()+this.getB());
        }else{
            System.out.println(base = this.getA()*this.getB());
        }
        System.out.println("O valor final é: "+base);
    }
}

package exerciciologica.servico;

import exerciciologica.domain.Base;

public class CalcularLogica extends Base {

    @Override
    public void calcular() {
        int base = this.getA()+this.getB();
        if(base > this.getC()){
            System.out.println(base+" é maior do que "+this.getC());
        }else{
            System.out.println(base+" é menor do que "+this.getC());
        }
    }
}

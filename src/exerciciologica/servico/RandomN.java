package exerciciologica.servico;

import exerciciologica.domain.Base;

public class RandomN extends Base {

    @Override
    public void calcular(){
        double random = Math.random()*99+1;
        System.out.println(random);
    }
}

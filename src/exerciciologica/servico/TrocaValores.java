package exerciciologica.servico;

import exerciciologica.domain.Base;

public class TrocaValores extends Base {

    @Override
    public void calcular(){
        int base = a;
        int baseDois = b;

        System.out.println("Valor um: "+base);
        System.out.println("Valor dois: "+baseDois);

        base = baseDois;
        baseDois = a;

        System.out.println("Valor um: "+base);
        System.out.println("Valor dois: "+baseDois);
    }
}

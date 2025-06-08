package exerciciologica.servico;

import exerciciologica.domain.Base;

public class Triangulo extends Base {

    @Override
    public void calcular(){
        int base = a;
        int ladoE = b;
        int ladoD = c;

        if (ladoE == ladoD && ladoE == base){
            System.out.println("Triangulo Equilatero.");
        }else if (ladoE == ladoD || ladoD == base & ladoE != base){
            System.out.println("Triangulo Isosceles.");
        }else if (base != ladoD & ladoE != base){
            System.out.println("Triangulo Escaleno.");
        }

    }
}

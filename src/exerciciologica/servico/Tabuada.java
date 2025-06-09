package exerciciologica.servico;

import exerciciologica.domain.Base;

public class Tabuada extends Base {

    @Override
    public void calcular(){
        do {
            System.out.println("----");
            System.out.println("Tabuada: "+a*1);
            System.out.println("Tabuada: "+a*2);
            System.out.println("Tabuada: "+a*3);
            System.out.println("Tabuada: "+a*4);
            System.out.println("Tabuada: "+a*5);
            System.out.println("Tabuada: "+a*6);
            System.out.println("Tabuada: "+a*7);
            System.out.println("Tabuada: "+a*8);
            System.out.println("Tabuada: "+a*9);
            System.out.println("Tabuada: "+a*10);
            System.out.println("----");
            a++;
        }while(a < 10);
    }
}

package exerciciologica.servico;

import exerciciologica.domain.BaseDouble;

public class Temperatura extends BaseDouble {

    @Override
    public void calcular(){
        double temperaturaFah = a;
        double temperaturaCel;

        System.out.println("A temperatura em Fah é: "+temperaturaFah);

        temperaturaCel = (5*(temperaturaFah-32)/9);

        System.out.println("A temperatura em Cel é: "+temperaturaCel);

    }

}

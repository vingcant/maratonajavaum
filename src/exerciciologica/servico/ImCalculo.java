package exerciciologica.servico;

import exerciciologica.domain.Base;

public class ImCalculo extends Base {



    @Override
    public void calcular(){
        System.out.println("Altura é: "+this.getAltura()+" e peso é: "+this.getPeso());

        double calculo = getPeso()/(getAltura()*getAltura());

        if ( calculo < 18.5){
            System.out.println("IMC é: "+calculo+", está abaixo da média.");
        }
        if ( calculo > 18.5 && calculo < 24.9){
            System.out.println("IMC é: "+calculo+", está normal.");
        }if ( calculo > 25.0 && calculo < 29.9){
            System.out.println("IMC é: "+calculo+", está levemente acima do normal.");
        }if ( calculo > 30.0 && calculo < 34.9){
            System.out.println("IMC é: "+calculo+", está classificado como obesidade.");
        }if ( calculo > 35.0  && calculo < 39.9){
            System.out.println("IMC é: "+calculo+", está classificado como obesidade grau II.");
        }if ( calculo > 40){
            System.out.println("IMC é: "+calculo+", está classificado como obesidade mórbida.");
        }
    }
}

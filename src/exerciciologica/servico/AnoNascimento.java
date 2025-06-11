package exerciciologica.servico;

import exerciciologica.domain.Base;

//Fiz o codigo primeiro dessa forma:
//@Override
//public void calcular(){
//    int ano = a;
//    int mes = b;
//    int dia = c;
//    int calculo;
//    int calculoDois;
//    int calculoTres;
//    int anoBase = 2025;
//    int mesBase = 6;
//    int diaBase = 6;
//
//    calculo = ano - anoBase;
//    calculoDois = mes - mesBase;
//    calculoTres = dia - diaBase;
//
//    System.out.println(calculo+" anos, "+calculoDois+" meses "+"e "+calculoTres+" dias");

//eu ja sabia que teria erros, mas quis pelo menos tentar fazer vez, depois fui buscar uma correção.


public class AnoNascimento extends Base {

    @Override
    public void calcular(){
        int ano = a;
        int mes = b;
        int dia = c;
        int anoBase = 2025;
        int mesBase = 6;
        int diaBase = 6;

        int calculo = anoBase - ano;
        int calculoDois = mesBase - mes;
        int calculoTres = diaBase - dia;

        if(calculoTres < 0){
            calculoDois--;
            calculoTres+=30;
        }
        if(calculoDois < 0){
            calculo--;
            calculoDois+=12;
        }



        System.out.println(calculo+" anos, "+calculoDois+" meses "+"e "+calculoTres+" dias");


    }
}

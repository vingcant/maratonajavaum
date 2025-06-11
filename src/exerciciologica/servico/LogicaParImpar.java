package exerciciologica.servico;

import exerciciologica.domain.ParImpar;

public class LogicaParImpar extends ParImpar {

    @Override
    public void calcular() {

        String divisivel = (num % 2 ==0) ? "Par" : "Impar";
        String posNeg = (num >= 0) ? "Positivo" : "Negativo";

        System.out.println(num+" é "+divisivel+" e "+posNeg);

//        if (num >= 0) {
//            if (num % 2 == 0) System.out.println(num + " é par e positivo");
//            else {
//                if (num % 2 == 1) {
//                    System.out.println(num + " é ímpar e positivo");
//                }
//            }
//        } else if (num < 0) {
//            if (num % 2 == 0) System.out.println(num + " é par e negativo");
//            else{
//                if (num % 2 == -1 ) {
//                    System.out.println(num + " é ímpar e negativo");
//                }
//            }
//        }
    }
}

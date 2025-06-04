package exerciciologica.servico;

import exerciciologica.domain.ParImpar;

public class LogicaParImpar extends ParImpar {

    @Override
    public void calcular() {
        if (num >= 0) {
            if (num % 2 == 0) System.out.println(num + " é par e positivo");
            else {
                if (num % 2 == 1) {
                    System.out.println(num + " é ímpar e positivo");
                }
            }
        } else if (num < 0) {
            if (num % 2 == 0) System.out.println(num + " é par e negativo");
            else{
                if (num % 2 == -1 ) {
                    System.out.println(num + " é ímpar e negativo");
                }
            }
        }
    }
}

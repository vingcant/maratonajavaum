package exerciciologica.servico;

import exerciciologica.domain.Base;

public class ValorDivisao extends Base {

    @Override
    public void calcular() {
        int quociente = getA() / getB();
        int resto = getA() % getB();

        System.out.println("Quociente de " + getA() + " x " + getB() + " = "+quociente);
        System.out.println("Resto de " + getA() + " x " + getB() + " = "+resto);

    }
}

package exerciciologica.servico;

import exerciciologica.domain.BaseDouble;

public class SalarioLogica extends BaseDouble {
    private final double SALARIO = 1293.20;
    @Override
    public void calcular() {
        System.out.println("O valor do seu salário é: "+this.getA());
        System.out.println("Você ganha aproximados: "+(this.getA()/this.SALARIO)+" salários mínimos");
    }
}

package exerciciologica.servico;

import exerciciologica.domain.BaseArray;

public class LeituraNota extends BaseArray {

    @Override
    public void calcular() {
        int base = 0;
        for (int i = 0; i < getNotas().length; i++) {
            base += notas[i];
        }
        int calculo = base/ getNotas().length;
        System.out.println(calculo);
    }
}

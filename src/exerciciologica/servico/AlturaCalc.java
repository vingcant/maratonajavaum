package exerciciologica.servico;

import exerciciologica.domain.BaseDouble;

public class AlturaCalc extends BaseDouble {
    double alturaFrancisco = 1.50;
    double alturaSara = 1.10;

    @Override
    public void calcular() {

        do {
            System.out.println("--------");
            System.out.println("A altura de Francisco é: " + alturaFrancisco);
            System.out.println("A altura de Sara é: " + alturaSara);
            alturaFrancisco+= 0.2;
            alturaSara+= 0.3;
            a++;
            System.out.println("Anos que se passaram: " + a);
            System.out.println("-------");
        } while (alturaSara < alturaFrancisco);
    }

    //por que nao foi possivel criar essa logica sem o metodo?
}

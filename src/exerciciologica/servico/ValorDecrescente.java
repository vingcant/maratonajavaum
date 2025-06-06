package exerciciologica.servico;

import exerciciologica.domain.Base;

public class ValorDecrescente extends Base {

    //explicar melhor mais tarde

    @Override
    public void calcular() {
        if (a < b) {
            int base = a;
            a = b;
            b = base;
        }
        if (a < c) {
            int base = a;
            a = c;
            c = base;
        }
        if (b < c) {
            int base = b;
            b = c;
            c = base;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

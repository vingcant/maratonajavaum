package javacore.formatation.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeUk = Locale.UK;
        Locale localeKO = Locale.KOREA;
        Locale localeCHI = Locale.CHINA;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeUk);
        nfa[2] = NumberFormat.getInstance(localeCHI);
        nfa[3] = NumberFormat.getInstance(localeKO);

        double valor = 100_000.204000;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat);
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(1);
            System.out.println(numberFormat.format(valor));
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println("_____");
        }

    }
}

package javacore.formatation.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest021 {
    public static void main(String[] args) {
        Locale localeUk = Locale.UK;
        Locale localeKO = Locale.KOREA;
        Locale localeCHI = Locale.CHINA;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeUk);
        nfa[2] = NumberFormat.getCurrencyInstance(localeCHI);
        nfa[3] = NumberFormat.getCurrencyInstance(localeKO);

        double valor = 100_000.204000;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$ 100.000,20";
        try{
            System.out.println(nfa[0].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

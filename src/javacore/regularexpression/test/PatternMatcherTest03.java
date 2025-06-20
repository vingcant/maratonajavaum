package javacore.regularexpression.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos os caraceteres/oq n for digito
        // \s = espaços em branco, possiveis espaços em branco: \t \n \f \r
        // \S = caracteres com exceção dos em branco, tudo q nao estiver no \s
        // \w = letras de a-Z, dígitos e _
        // \W = tudo que não estiver no \w
        //[] procura todas os caracteres dentro desse range
        String regex = "0[xX][0-9a-fA-F]";
//        String text = "é mafia";
        String text2 = "8456 4x xx0 xX45 x84F 0x54F 0xF844F5G";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text: "+text2);
        System.out.println("regex: "+regex);

        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+" ");
        }


    }
}

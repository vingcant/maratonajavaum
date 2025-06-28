package javacore.regularexpression.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = todos os caraceteres/oq n for digito
        // \s = espaços em branco, possiveis espaços em branco: \t \n \f \r
        // \S = caracteres com exceção dos em branco, tudo q nao estiver no \s
        // \w = letras de a-Z, dígitos e _
        // \W = tudo que não estiver no \w
        //[] procura todas os caracteres dentro desse range
        //^ > procura pelo começo [^] > funciona como negação, termina
        //. permite qualquer coisa

        String regex = "([a-zA-Z0-9\\._])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "paulx@gmail.c,om, pauly@hotmail.com, pauli!!@hotmail.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+text);
        System.out.println("regex: "+regex);

        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group()+" ");
        }


    }
}

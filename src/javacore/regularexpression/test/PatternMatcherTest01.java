package javacore.regularexpression.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "a ";
        String text = "é mafia";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+text);
        System.out.println("regex: "+regex);

        while (matcher.find()){
            System.out.println(matcher.start());
        }


    }
}

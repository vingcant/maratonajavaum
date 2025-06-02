package javacore.interfacess.test;

import javacore.interfacess.domain.Demerito;
import javacore.interfacess.domain.Premio;

public class GolsTest {
    public static void main(String[] args) {
        Premio premio = new Premio();
        Demerito demerito = new Demerito();

        premio.gols();
        demerito.gols();

        premio.assistencia();
        demerito.assistencia();

        premio.chancePerdida();
        demerito.chancePerdida();
    }
}

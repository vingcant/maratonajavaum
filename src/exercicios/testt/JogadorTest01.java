package exercicios.testt;

import exercicios.domaiin.Chave;
import exercicios.domaiin.Jogador;
import exercicios.domaiin.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Paule", 18, Chave.chave(4));
        Jogador jogadorDois = new Jogador("Paull", 19, Chave.chave(2));
        Time time = new Time("PSG");
        Jogador[] jogadores = {jogador, jogadorDois};

        jogador.setTime(time);
        jogadorDois.setTime(time);
        time.setJogador(jogadores);

        System.out.println(jogador);
        System.out.println("-----------");
        System.out.println(jogadorDois);


    }
}

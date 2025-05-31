package exercicios.domaiin;

public class Time {
    private String nome;
    private Jogador[] jogador;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogador) {
        this.nome = nome;
        this.jogador = jogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogador;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogador = jogador;
    }
}

package exercicios.domaiin;
import javacore.heranca.domain.Pessoa;

public class Jogador extends Pessoa {
    private Time time;
    private Chave chave;

    public Jogador(String nome, int idade, Chave chave) {
        super(nome, idade);
        this.chave = chave;
    }

    @Override
    public String toString() {
        return "Nome do jogador: " + this.nome + "\nIdade do jogador: " + this.idade + "\nTime: " + time.getNome() + "\nSeu quarto será: " + this.chave;
    }



    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}

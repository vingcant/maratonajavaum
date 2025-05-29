package javacore.associacao.dominio;

public class AlunoDois {
    String nome;
    int idade;
    Seminario seminario;

    public AlunoDois(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public void imprime(){
        System.out.println("Aluno: "+this.nome+", idade: "+this.idade);
        if (seminario != null){
            System.out.println("O seu seminário será: "+seminario.getTitulo());
        }
    }


    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public Seminario getSeminario(){
        return seminario;
    }

    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

}

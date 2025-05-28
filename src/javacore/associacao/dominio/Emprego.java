package javacore.associacao.dominio;

public class Emprego {
    private String nome;
    private Pessoa[] pessoa;



    public Emprego (String nome){
        this.nome = nome;
    }

    public Emprego (String nome, Pessoa[] pessoa){
        this.nome = nome;
        this.pessoa = pessoa;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(pessoa== null) return;
        for (Pessoa pessoas : pessoa){
            System.out.println(pessoas.getNome());
        }
    }

    public void setPessoa (Pessoa[] pessoa){
        this.pessoa = pessoa;
    }

    public Pessoa[] getPessoa(){
        return pessoa;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}

package javacore.associacao.dominio;

public class Pessoa {
    private String nome;
    private Emprego emprego;

    public Pessoa(String nome) {
        this.nome = nome;

    }

    public void imprime() {
        System.out.println(this.nome);

        if (emprego != null) {
            System.out.println(emprego.getNome());
        }
    }

    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}

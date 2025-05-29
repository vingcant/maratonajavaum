package javacore.associacao.dominio;

public class ProfessorDois {
    String nome;
    String especialidade;
    Seminario[] seminarios;

    public ProfessorDois(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public ProfessorDois(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("Professor: "+this.nome+", Especialidade: "+this.especialidade);
        if(seminarios !=null){
            System.out.println("O professor "+this.nome+" irá ministrar os seguintes seminários: ");
            for (Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo());
            }
        }
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecialidade(String especialdiade){
        this.especialidade = especialidade;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}

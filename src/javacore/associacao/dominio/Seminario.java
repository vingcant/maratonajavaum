package javacore.associacao.dominio;

public class Seminario {
    String titulo;
    AlunoDois[] alunos;
    Local local;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo, AlunoDois[] alunos){
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("O seminário é: "+this.titulo+".");
        if (alunos ==null) return;
        for (AlunoDois aluno : alunos){
            System.out.println("Os alunos para fazer: "+aluno.getNome());
        }
        System.out.println("O seminário será realizado no seguinte local: "+local.getEndereco());
    }



    public AlunoDois[] getAlunos(){
        return alunos;
    }

    public void setAlunos(AlunoDois[] alunos){
        this.alunos = alunos;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}

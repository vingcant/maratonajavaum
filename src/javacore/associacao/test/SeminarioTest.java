package javacore.associacao.test;

import javacore.associacao.dominio.AlunoDois;
import javacore.associacao.dominio.Local;
import javacore.associacao.dominio.ProfessorDois;
import javacore.associacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        AlunoDois aluno = new AlunoDois("Pauly", 15);
        AlunoDois aluno2 = new AlunoDois("Paulp", 18);
        Seminario seminario = new Seminario("Lst");
        Seminario seminario2 = new Seminario("Plt");
        ProfessorDois professor = new ProfessorDois("Paulq", "Ciência");
        Local local = new Local("Sul");
        AlunoDois[] alunos = {aluno, aluno2};
        Seminario[] seminarios = {seminario, seminario2};

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario2);
        seminario.setAlunos(alunos);
        seminario.setLocal(local);
        professor.setSeminarios(seminarios);

        System.out.println("-------");
        seminario.imprime();
        System.out.println("-------");
        aluno.imprime();
        System.out.println("-------");
        professor.imprime();

    }
}

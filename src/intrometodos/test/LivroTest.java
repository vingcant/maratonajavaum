package intrometodos.test;

import intrometodos.domain.Livro;

public class LivroTest {
    public static void main(String[] args){
        Livro livro = new Livro("Fábulas", "Pacchini", 152);

        livro.exibirInfo();

//        livro.emprestar();
//        livro.exibirInfo();
        System.out.println("______________________");
        livro.devolver();
        livro.exibirInfo();

//        livro.devolver();
//        livro.emprestar();

    }
}

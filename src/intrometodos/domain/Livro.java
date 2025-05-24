package intrometodos.domain;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean estaEmprestado;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.estaEmprestado = false;
    }


    public void emprestar() {
        if (estaEmprestado) {
            System.out.println("Livro já emprestado");
        } else {
            estaEmprestado = true;
            System.out.println("Livro emprestado com sucesso");
        }

    }

    public void devolver() {
        if (!estaEmprestado) {
            System.out.println("Livro disponível");
        } else {
            estaEmprestado = false;
            System.out.println("Livro devolvido");
        }
    }

    public void exibirInfo() {
        System.out.println("Infos do livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade de Páginas: " + paginas);
        System.out.println("Status do Livro: " + (estaEmprestado ? "Emprestado" : "Disponível"));
    }


}

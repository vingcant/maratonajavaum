package exercicios.domaiin;

public enum Chave {
    QUARTO_1(1),
    QUARTO_2(2),
    QUARTO_3(3),
    QUARTO_4(4),
    QUARTO_5(5),
    QUARTO_6(6),
    QUARTO_7(7),
    QUARTO_8(8),
    QUARTO_9(9),
    QUARTO_10(10);

    public final int NUMERO_QUARTO;

    Chave(int numeroQuarto){
        this.NUMERO_QUARTO = numeroQuarto;
    }

    public static Chave chave(int NUMERO_QUARTO){
        for(Chave chaves : values()){
            if(chaves.getNUMERO_QUARTO() == NUMERO_QUARTO){
                return chaves;
            }
        }return null;
    }

    public int getNUMERO_QUARTO() {
        return NUMERO_QUARTO;
    }
}

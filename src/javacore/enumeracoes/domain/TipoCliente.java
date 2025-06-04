package javacore.enumeracoes.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");
    //Obrigatoriamente a criação do atributo vem após as enumerações
    public final int VALOR;
    public final String NOME_RELATO;

    TipoCliente(int valor, String nomeRelato){
        this.VALOR = valor;
        this.NOME_RELATO = nomeRelato;
    }


    public static TipoCliente tipoClienteNR(String nomeRelato) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNOME_RELATO().equals(nomeRelato)) {
                return tipoCliente;
            }
        }return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_RELATO() {
        return NOME_RELATO;
    }
}

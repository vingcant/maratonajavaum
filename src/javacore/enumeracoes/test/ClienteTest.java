package javacore.enumeracoes.test;

import javacore.enumeracoes.domain.Cliente;
import javacore.enumeracoes.domain.TipoPagamento;
import javacore.enumeracoes.domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pauly", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Pauln", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelato());
        TipoCliente tipoCliente1 = TipoCliente.tipoClienteNR("Pessoa Fisica");
        System.out.println(tipoCliente1);
    }
}

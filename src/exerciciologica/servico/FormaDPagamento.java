package exerciciologica.servico;

import exerciciologica.domain.Produto;

public class FormaDPagamento extends Produto {

    @Override
    public void calcular() {

        if (this.getA() == 1) {
            System.out.println(this.getA());
            System.out.println("O produto escolhido foi a Batata Cozida e custa " + valor);
        } else if (this.getA() == 2) {
            System.out.println(this.getA());
            System.out.println("O produto escolhido foi Batata Frita.");
        } else if (this.getA() != 1 || this.getA() != 2) {
            System.out.println("Nenhum número associado à escolha.");
        }

        System.out.println("Selecione seu método de pagamento: ");
        System.out.println("1 para Pix ou Dinheiro = 15% de desconto.");
        System.out.println("2 para A vista no cartão = 10% de desconto.");
        System.out.println("3 para Parcelado no cartão em duas vezes = Preço normal. ");
        System.out.println("4 para Parcelado no cartão em tres ou mais = Preço normal mais juros de 10%.");
    }
}

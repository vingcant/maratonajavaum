package exerciciologica.servico;

import exerciciologica.domain.Produto;

public class MetodoPagamento extends Produto {

   public void calcular(){
      double calculo;
      if (this.getB() == 1){
         calculo = valor - valor*0.15;
         System.out.println("O valor a ser pago é "+calculo);
      }
      if (this.getB() == 2){
         calculo = valor - valor*0.10;
         System.out.println("O valor a ser pago é "+calculo);
      }if (this.getB() == 3){
         calculo = valor;
         System.out.println("O valor a ser pago é "+calculo);
      }if (this.getB() == 4){
         calculo = valor+(valor*0.1*3);
         System.out.println("O valor a ser pago é "+calculo);
      }

   }
}

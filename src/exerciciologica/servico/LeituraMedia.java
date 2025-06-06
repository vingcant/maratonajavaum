package exerciciologica.servico;

import exerciciologica.domain.BaseArray;

public class LeituraMedia extends BaseArray {

    @Override
    public void calcular(){
        int base = 0;
        for (int i = 0; i < notas.length; i++) {
            base += notas[i];
        }
        int calculo = base/getNotas().length;

        if (calculo >= 7){
            System.out.println("Aluno "+this.getNome()+" teve uma média de "+calculo+" e foi aprovado");
        }else if (calculo < 7){
            System.out.println("Aluno "+this.getNome()+" teve uma média de "+calculo+" e foi reprovado");

        }
    }
}

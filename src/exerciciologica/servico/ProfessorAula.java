package exerciciologica.servico;

import exerciciologica.domain.Base;

public class ProfessorAula extends Base {
    private final int SALARIO = 2600;

    @Override
    public void calcular(){

        System.out.println("O salario bruto é: "+SALARIO);
        System.out.println("O professor leciona 10 aulas na semana. Valor por aula: "+SALARIO/40);
        System.out.println("Um total de 40 aulas por mês.");
        System.out.println("Salario final com INSS: "+(SALARIO-(SALARIO*0.10)));

    }
}

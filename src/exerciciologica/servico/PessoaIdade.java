package exerciciologica.servico;

import exerciciologica.domain.Base;

public class PessoaIdade extends Base {

    @Override
    public void calcular() {
        System.out.println("Nome: "+this.getNome() +". Idade: "+this.getA());

        if (this.getA() >= 18){
            System.out.println("Maior de idade");
            System.out.println("Então, "+this.getNome()+" é de maior");
        }else if (this.getA() < 18){
            System.out.println("Menor de idade.");
            System.out.println("Então, "+this.getNome()+" é de menor");
        }
    }
}

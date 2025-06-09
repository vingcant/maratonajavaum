package exerciciologica.servico;

import exerciciologica.domain.BaseDouble;

public class Viagem extends BaseDouble {


    @Override
    public void calcular(){
        double distancia = getA();
        double velocidade = getB();
        System.out.println("-----");
        System.out.println("Carro utiliza um litro para fazer 12km e o limite de velocidade é 180km.");
        if (velocidade > 180){
            System.out.println("Velocidade impossivel com o atual veiculo.");
        }
        System.out.println("-----");
        System.out.println("Distancia: "+distancia);
        System.out.println("Velocidade: "+velocidade);
        System.out.println("Litros usados: "+distancia/12);
        double tempo = distancia/velocidade;
        System.out.println("Tempo necessario: "+tempo);
        System.out.println("-----");

    }
}

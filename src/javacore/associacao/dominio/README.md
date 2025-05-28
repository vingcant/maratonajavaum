# Explicação Teórica

## Base:
* Nesse pacote tudo esta relacionado à associação, portanto, essa "explicação" vai abranger somente o que for 
conveniente ao assunto.
----
* Em primeiro lugar, o conceito de assosicação:
1. Refere association aquilo que tende a ter uma referencia para varias, varias referencias para uma ou varias
para varias. Simplificando, um para muitos, muitos para um, muitos para muitos.
Essa lógica vai ser abreviada com o termo 1 - M, M - 1 e M - M.
-----
### Classe Pessoa
* Essa classe tem uma referência originalmente de um para muitos; no caso, uma pessoa pode ter um emprego, e esse
emprego pode ter varias pessoas. Eventualmente, mudei para M - M. 
1. A criação dos atributos é a primeira parte diferente até agora. Nela, criei além do nome de Pessoa, um atributo 
do tipo **Emprego**, ou seja, a associação nasce daí. 
2. A seguir, um construtor que obriga a necessidade de um nome. 
3. O método imprime envia o nome da pessoa e depois verifica se há ou não a presença de um emprego, pois caso não, 
aconteceria um NullPointerExcepction, ou seja, o programa tentaria acessar um ponto na memória que não tem nada para
mostrar. A próxima impressão, caso haja sim algo na memória, printa o getter, normal.
----
### Classe Emprego
* M - M. Como muitas das coisas presentes nessas classes são repetidas, não vejo necessidade de repetir também a
explicação.
1. Aqui há a presença de dois construtores, incluindo uma sobrecarga deles. Além disso, nos atributos, algo que ainda 
me confunde bastante também faz-se presente: arrays. O atributo do tipo Pessoa (classe) é dado como [] pois, logicamente
falando, haveria muitas pessoas... Enfim.
2. A única diferença para esse imprime é a verificação de que, se pessoa for igual a nulo, um return aconteceria. Senão,
segue o for each normalmente (Em breve farei algo para entender melhor for e arrays).
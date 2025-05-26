# Explicação Array

## Base:
* Fazer uma calculadora que recebesse uma lista de arrays e a partir dessa lista
retornasse os valores nela em dobro.

--- 

### Empecilhos:
* Tive dificuldade no inicio referente a como fazer a parte dos metodos funcionar. Originalmente, a intenção era que 
**exibir** fosse usada junto com um argumento, oriundo do atributo número, porém acontecia um erro.
----
#### Erro
* Para esse tipo de situação, é necessário para se passar um parâmetro declarar o tipo de tal e óbvio, o nome, mas ao 
isso ser feito, o atributo numeros, anteriormente chamada de calculadora (que deveria ser utilizado), era ignorado.
Isso se deve porque originalmente:
1. O parametro e a classe possuiam o mesmo nome, e não havia o uso do "this."
2. A multiplicação que ocorria era feita diretamente no índice, e não no valor do array de acordo com o espaço em memória.
3. O return anterior retornava "calculadora", ou seja, o parametro original, e não o atributo e sua multiplicação.
----
### Solução
#### A solução foi:
1. Não utilizar mais de parâmetros. Não consegui achar uma forma prática de adaptar nesse momento.
2. Alterar a lógica de calculo para o atributo **numeros** acessar a variavel **i** criada para o loop. 
Dessa forma, o número respectivo à posição da variavel **i** seria multiplicado (*=).

---
### Adendos:
* Descobri coisas que não sabia. Aparentemente, um método do tipo return não necessariamente precisa de um parâmetro,
algo que eu pensava que era preciso. A principal dúvida aqui foi referente a essa confusão. 
# API Gateways e Java Wildcards

## O que são Wildcards?
  * No código genérico, o ponto de interrogação (?), 
    denominado curinga, representa um tipo desconhecido.
    O curinga pode ser usado em diversas situações: como tipo de parâmetro,
    campo ou variável local; às vezes como um tipo de retorno
    (embora seja uma melhor prática de programação ser mais específico). 
    O curinga nunca é usado como argumento de tipo para uma invocação de 
    método genérico, criação de uma instância de classe genérica ou um supertipo.

## Reflection Entry Point - Class<?>
  * ? é muito usual quando o compilador não sabe exatamente um determinado tipo;
  * Class<?> É um ponto de entrada para analisar nossas classes
  * Um objeto do tipo Class<?> contém toda informação em
    * Um dado objeto em tempo de execução;
    * Uma classe da nossa aplicação.
  * Nas informações inclui:
    * Quais métodos e propriedades nossa classe possui;
    * Quais classes implementa e estende.
  * Ao usar Class<?> podemos descrever um objeto de uma classe de qualquer tipo;
  * Class<?> é um super tipo da classe Class<T> de tipo T.

# Constructor Discovery and Object Creation

## O que é um Construtor?
  * Um construtor de uma classe Java é representado por uma instância da classe Constructor<?>
  * O construtor contem todas as informações a respeito de uma classe como:
    * Número de parâmetros;
    * Tipos de parâmetros;

## Possibilidades com Reflection
  * Com reflection podemos ter acesso total a todos métodos
    * public
    * protected
    * package-private
    * private
  * Com Constructor.newInstance() nós podemos criar objetos de classes usando construtores restritos.

## Métodos dos objetos de Construtor<?>
  * Class.getDeclaredConstructors()
    * Construtores públicos e privados.
  * Class.getConstructors
    * Apenas construtores públicos.

## Observações
  * Se uma classe não possui construtores, o Java por padrão cria um construtor padrão sem parâmetros
package execao;

public class _2errosexecoes {
/*
 A diferença fundamental entre erros (errors) e exceções (exceptions) em Java está em sua natureza e no modo como são tratados:

1. Erros (Errors):
Representam problemas graves relacionados ao ambiente de execução (como o sistema ou a JVM), que geralmente estão fora do controle do programa.

Exemplos:

OutOfMemoryError (falta de memória).

StackOverflowError (estouro da pilha).

VirtualMachineError (problemas críticos da JVM).

Características:

Geralmente, não devem ser tratados no programa, pois indicam falhas que o desenvolvedor não consegue corrigir diretamente.

São derivados da classe Error, que está na hierarquia de Throwable.

2. Exceções (Exceptions):
Representam condições anormais que podem ser previstas e tratadas dentro do código.

Exemplos:

NullPointerException (uso de referência nula).

IOException (problemas de entrada/saída, como abrir um arquivo inexistente).

ArithmeticException (divisão por zero).

Características:

O desenvolvedor pode e deve tratá-las usando blocos try-catch ou propagá-las com throws.

São derivadas da classe Exception, que também está na hierarquia de Throwable.

Resumo:

Erros: Problemas graves e imprevisíveis, geralmente fora do controle do programa (não tratáveis).

Exceções: Situações previstas que podem ser tratadas para evitar interrupções no programa. 
 */
}

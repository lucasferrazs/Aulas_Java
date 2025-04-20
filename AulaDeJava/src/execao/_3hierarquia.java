package execao;

public class _3hierarquia {
/*
 1. Throwable
É a superclasse de todos os erros e exceções em Java.

Todo objeto que representa um erro ou uma condição excepcional precisa ser uma instância de Throwable.

Possui dois principais subtipos diretos:

Error: Representa erros graves relacionados ao ambiente da JVM.

Exception: Representa exceções tratáveis no programa.

2. Error
Definição: Subclasse direta de Throwable, usada para erros que o programa não consegue ou não deve tratar.

Exemplos comuns:

OutOfMemoryError: Erro de falta de memória.

StackOverflowError: Estouro de pilha.

Características:

Geralmente indica problemas sérios na JVM ou no sistema.

Não é recomendável capturar ou tentar tratar um Error no código, pois normalmente exige intervenção no ambiente de execução.

3. Exception
Definição: Subclasse direta de Throwable, usada para condições excepcionais que podem e devem ser tratadas pelo programa.

Exceções se dividem em:

Verificadas (Checked Exceptions):

São verificadas em tempo de compilação.

Devem ser tratadas ou declaradas com throws.

Exemplo: IOException, SQLException.

Não Verificadas (Unchecked Exceptions):

Ocorrem durante a execução e não precisam ser tratadas explicitamente.

Exemplo: NullPointerException, ArrayIndexOutOfBoundsException.

Permite ao desenvolvedor utilizar try-catch para capturar e tratar o erro, garantindo que o programa continue funcionando de forma controlada. 
 */
}

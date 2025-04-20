package modulo1;

public class OrientacaoAspecto {
/*
 Programação Orientada a Aspectos (AOP, do inglês Aspect-Oriented Programming) é um paradigma de 
 programação que permite a separação de preocupações em um sistema, facilitando a modularização de 
 funcionalidades transversais que afetam várias partes de uma aplicação. Essas funcionalidades 
 transversais incluem, por exemplo, logging, segurança, gerenciamento de transações, tratamento 
 de exceções, entre outras.

Conceitos Principais da AOP
Aspecto: Um aspecto é um módulo que encapsula uma preocupação transversal. Por exemplo, 
um aspecto de logging pode conter a lógica para registrar informações sobre a execução de 
métodos em toda a aplicação.

Join Point: Um join point é um ponto específico na execução de um programa onde um aspecto pode ser aplicado. 
Isso pode incluir chamadas de métodos, exceções lançadas, ou a execução de um construtor.

Advice: O advice é a ação que deve ser executada em um join point. Existem diferentes tipos de advice:

Before: Executado antes do join point.
After: Executado após o join point, independentemente do resultado.
After Returning: Executado após o join point, apenas se ele for bem-sucedido.
After Throwing: Executado se o join point lançar uma exceção.
Around: Envolve a execução do join point, permitindo que você execute código antes e depois dele.
Pointcut: Um pointcut é uma expressão que define um conjunto de join points onde um advice deve ser aplicado. 
Ele permite que você especifique quais métodos ou classes devem ser interceptados.

Weaving: Weaving é o processo de integrar aspectos com o código da aplicação. Isso pode ser feito em tempo de 
compilação, em tempo de carregamento ou em tempo de execução.

Exemplo de AOP no Spring Framework
O Spring Framework oferece suporte à AOP, permitindo que você defina aspectos e os aplique a seus beans. 
Aqui está um exemplo simples de como usar AOP no Spring: 

1. Dependências
Certifique-se de ter as dependências do Spring AOP em seu projeto. Se você estiver usando Maven, adicione o seguinte ao seu pom.xml:

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>


2. Definindo um Aspecto
Aqui está um exemplo de um aspecto que registra a execução de métodos:


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @After("execution(* com.exemplo.servico.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Método executado: " + joinPoint.getSignature().getName());
    }
}

Neste exemplo, o aspecto LoggingAspect registra a execução de todos os métodos na classe de serviço dentro do pacote com.exemplo.servico.

3. Usando o Aspecto
Agora, você pode ter uma classe de serviço que será interceptada pelo aspecto:

import org.springframework.stereotype.Service;

@Service
public class MeuServico {
    public void realizarAcao() {
        System.out.println("Ação realizada!");
    }
}

4. Executando a Aplicação
Quando você chamar o método realizarAcao() da classe MeuServico, o aspecto LoggingAspect será acionado, e você verá a mensagem de log após a execução do método.

Vantagens da AOP
Separação de Preocupações: Permite que você mantenha a lógica de negócios separada da lógica transversal, tornando o código mais limpo e fácil de manter.
Reutilização de Código: Aspectos podem ser reutilizados em diferentes partes da aplicação, evitando duplicação de código.
Facilidade de Manutenção: Alterações em funcionalidades transversais podem ser feitas em um único lugar, sem a necessidade de modificar várias classes.
 */
}

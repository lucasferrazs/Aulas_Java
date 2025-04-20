package modulo3;

public class oqespringboot {
/*
 Spring Boot é um projeto do Spring Framework que visa simplificar o processo de configuração e desenvolvimento de aplicações 
 Java baseadas em Spring. Ele fornece uma abordagem "opinionated" (ou seja, com opiniões sobre como as coisas devem ser feitas) 
 para a criação de aplicações, permitindo que os desenvolvedores se concentrem na lógica de negócios em vez de se preocuparem com a configuração.

Principais Características do Spring Boot
Configuração Automática:

O Spring Boot oferece configuração automática, o que significa que ele tenta configurar automaticamente sua aplicação com base 
nas dependências que você adicionou. Isso reduz a quantidade de configuração manual necessária.
Standalone:

As aplicações Spring Boot podem ser executadas como aplicações Java autônomas, sem a necessidade de um servidor de aplicação externo. 
Isso é possível porque o Spring Boot inclui um servidor embutido (como Tomcat, Jetty ou Undertow).
Dependências Simplificadas:

O Spring Boot utiliza o conceito de "starters", que são conjuntos de dependências que facilitam a inclusão de funcionalidades específicas. 
Por exemplo, você pode adicionar o starter spring-boot-starter-web para incluir tudo o que é necessário para criar uma aplicação web.
Produção Pronta:

O Spring Boot inclui recursos prontos para produção, como monitoramento, métricas e gerenciamento de saúde da aplicação, facilitando a 
implementação e a manutenção de aplicações em ambientes de produção.
Facilidade de Testes:

O Spring Boot oferece suporte integrado para testes, permitindo que você escreva testes de unidade e de integração de forma mais fácil e rápida.
Configuração Externa:

O Spring Boot permite que você externalize a configuração da sua aplicação, utilizando arquivos de propriedades (application.properties ou application.yml), 
variáveis de ambiente ou argumentos de linha de comando.
Exemplo de Aplicação Spring Boot
Aqui está um exemplo simples de como criar uma aplicação Spring Boot:

Criar um Novo Projeto:

Você pode usar o Spring Initializr para gerar um projeto Spring Boot. Escolha as dependências que deseja incluir (por exemplo, Spring Web, Spring Data JPA, etc.) 
e baixe o projeto.
Estrutura do Projeto:

Após descompactar o projeto, você verá uma estrutura de diretórios semelhante a esta:


src
└── main
    ├── java
    │   └── com
    │       └── exemplo
    │           └── demo
    │               └── DemoApplication.java
    └── resources
        └── application.properties


Classe Principal:

A classe principal da aplicação pode ser semelhante a esta:


package com.exemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}


Criar um Controlador:

Você pode criar um controlador simples para responder a requisições HTTP:


package com.exemplo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Olá, Mundo!";
    }
}


Executar a Aplicação:

Você pode executar a aplicação usando o comando:
./mvnw spring-boot:run

ou, se estiver usando Gradle:

./gradlew bootRun


Acessar a Aplicação:

Após a aplicação estar em execução, você pode acessar http://localhost:8080/hello em um navegador ou ferramenta de API 
(como Postman) para ver a resposta "Olá, Mundo!".
 */
}

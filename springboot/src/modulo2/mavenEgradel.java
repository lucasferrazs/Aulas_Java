package modulo2;

public class mavenEgradel {
	/*Maven e Gradle são ferramentas de automação de construção (build automation) amplamente utilizadas em projetos de software, especialmente em projetos Java. Ambas têm como objetivo facilitar o gerenciamento de dependências, a construção do projeto, a execução de testes e a criação de pacotes, mas diferem em suas abordagens e características.

	Maven
	O que é? Maven é uma ferramenta de gerenciamento de projetos e automação de construção que utiliza um modelo baseado em XML para descrever a estrutura do projeto e suas dependências. O arquivo principal de configuração do Maven é chamado pom.xml (Project Object Model).

	Características:

	Modelo Declarativo: O Maven usa um modelo declarativo, onde você define as dependências e configurações no arquivo pom.xml.
	Ciclo de Vida de Construção: O Maven possui um ciclo de vida de construção bem definido, que inclui fases como compile, test, package, install e deploy.
	Repositórios: O Maven utiliza repositórios para gerenciar dependências. O repositório central do Maven é um repositório online que contém uma vasta quantidade de bibliotecas e frameworks.
	Plugins: O Maven possui uma ampla gama de plugins que podem ser usados para estender suas funcionalidades.
	Exemplo de pom.xml:*/
	
/*	<project xmlns="http://maven.apache.org/POM/4.0.0"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	    <modelVersion>4.0.0</modelVersion>
	    <groupId>com.exemplo</groupId>
	    <artifactId>meu-projeto</artifactId>
	    <version>1.0-SNAPSHOT</version>
	    <dependencies>
	        <dependency>
	            <groupId>org.springframework</groupId>
	            <artifactId>spring-context</artifactId>
	            <version>5.3.10</version>
	        </dependency>
	    </dependencies>
	</project>
	
	*/
	
	
	/*
Gradle
O que é? Gradle é uma ferramenta de automação de construção que utiliza uma abordagem baseada em scripts, 
permitindo que você escreva a configuração do projeto em Groovy ou Kotlin. O arquivo principal de configuração do Gradle é chamado build.gradle.

Características:

Modelo Imperativo: O Gradle usa um modelo imperativo, onde você pode programar a lógica de construção usando uma linguagem de script.
Flexibilidade: O Gradle é altamente flexível e pode ser usado para construir projetos em várias linguagens, não apenas Java.
Desempenho: O Gradle possui um sistema de cache inteligente e suporte a construção incremental, o que pode resultar em tempos de construção mais rápidos.
Plugins: O Gradle também possui uma vasta gama de plugins e pode ser facilmente estendido. 
	 */
	/*plugins {
	    id 'java'
	}

	group 'com.exemplo'
	version '1.0-SNAPSHOT'

	repositories {
	    mavenCentral()
	}

	dependencies {
	    implementation 'org.springframework:spring-context:5.3.10'
	}
	
Qual é o mais utilizado?
A escolha entre Maven e Gradle pode depender de vários fatores, incluindo a preferência da equipe, a complexidade do projeto 
e as necessidades específicas. No entanto, algumas observações gerais podem ser feitas:

Maven: É uma ferramenta mais antiga e tem uma base de usuários muito grande. É frequentemente preferido em projetos 
que seguem uma estrutura de projeto padrão e onde a simplicidade e a previsibilidade são importantes.

Gradle: Tem ganhado popularidade nos últimos anos, especialmente em projetos mais complexos que se beneficiam de sua 
flexibilidade e desempenho. É especialmente popular em projetos Android, onde o Gradle é a ferramenta de construção padrão.	
	*/
	
	
	
}

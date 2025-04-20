package modulo2;

public class injecaodependencia {
/*
O que é Injeção de Dependência (DI)?

A Injeção de Dependência (DI) é um padrão de design que permite que um objeto (ou classe) receba suas 
dependências de uma fonte externa, em vez de criá-las internamente. Isso promove um acoplamento mais fraco 
entre os componentes de um sistema, facilitando a manutenção, a testabilidade e a reutilização do código.

Em termos simples, a DI permite que um objeto declare quais dependências ele precisa, e o framework (como o Spring) 
é responsável por fornecer essas dependências no momento da criação do objeto.

Como Funciona a Injeção de Dependência?
A DI pode ser implementada de várias maneiras, mas as duas abordagens mais comuns são:
   
Injeção por Construtor:

As dependências são fornecidas ao objeto através de seu construtor. Isso garante que o objeto esteja sempre 
em um estado válido, pois todas as suas dependências são fornecidas no momento da criação.   
   
 */
	/*
	public class Carro {
	    private Motor motor;

	    // Injeção de dependência via construtor
	    public Carro(Motor motor) {
	        this.motor = motor;
	    }
*/
	    // Métodos da classe
	//}
	
	/*
	 public class Carro {
    private Motor motor;

    // Injeção de dependência via construtor
    public Carro(Motor motor) {
        this.motor = motor;
    }

    // Métodos da classe
}


Injeção por Setter:

As dependências são fornecidas ao objeto através de métodos setter. Isso permite que as dependências 
sejam alteradas após a criação do objeto, mas pode resultar em um estado inválido se as dependências 
não forem configuradas corretamente.

public class Carro {
    private Motor motor;

    // Injeção de dependência via setter
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Métodos da classe
}

Como a DI é Implementada no Spring Framework?
No Spring Framework, a DI é gerenciada pelo contêiner de IoC (Inversion of Control). O contêiner é responsável por criar, 
configurar e gerenciar o ciclo de vida dos objetos (chamados de beans) em uma aplicação Spring. Aqui está como funciona:

Definição de Beans:

Os beans são definidos em arquivos de configuração XML, classes de configuração Java (usando anotações como @Configuration), 
ou diretamente com anotações em classes (como @Component, @Service, etc.).


	 */
	
	
}

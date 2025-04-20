package modulo2;

public class oquesaoanotacoes {
/*
 As anotações no Spring Framework são uma forma de fornecer metadados sobre classes, métodos e 
 campos, permitindo que o framework realize a configuração e o gerenciamento de componentes de forma
 mais simples e declarativa. Elas são uma parte fundamental da programação em Spring, pois ajudam a 
 reduzir a quantidade de configuração XML necessária e tornam o código mais legível e fácil de manter.
 
 Exemplos de anotações 
 *****************************************************************************************************************
 @Component: Indica que uma classe é um componente do Spring. O Spring irá detectar essa classe durante a 
 varredura de componentes e registrá-la no contexto da aplicação.
 
 import org.springframework.stereotype.Component;

	@Component
	public class MyComponent {
	    public void doSomething() {
	        System.out.println("Doing something...");
	    }
	}
 *****************************************************************************************************************	
	@Service: Uma especialização da anotação @Component, usada para marcar classes de serviço. 
	É uma forma de indicar que a classe contém lógica de negócios.
	
	import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void performService() {
        System.out.println("Performing service...");
    }
}
 *****************************************************************************************************************
 @Repository: Outra especialização de @Component, usada para classes que acessam o banco de dados. 
 Ela também fornece funcionalidades adicionais, como a tradução de exceções específicas do banco de dados 
 em exceções do Spring.
 
 import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {
    public void save() {
        System.out.println("Saving data...");
    }
}
 *****************************************************************************************************************
@Controller: Usada em classes que atuam como controladores em uma aplicação web, geralmente em conjunto com o Spring MVC. 
Ela indica que a classe é responsável por lidar com requisições HTTP.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }
}
 *****************************************************************************************************************
@Autowired: Usada para injeção de dependência. O Spring irá automaticamente injetar a instância necessária da classe marcada com @Autowired.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    
    @Autowired
    private MyService myService;

    public void execute() {
        myService.performService();
    }
}

 *****************************************************************************************************************
 
 @Configuration
Essa anotação é usada para indicar que uma classe contém definições de beans. É uma alternativa ao uso de arquivos XML para configuração.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MeuComponente meuComponente() {
        return new MeuComponente();
    }
}
 *****************************************************************************************************************
@Value

Essa anotação é usada para injetar valores de propriedades em campos de classe.
 
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MeuComponente {
    @Value("${minha.propriedade}")
    private String propriedade;

    public void mostrarPropriedade() {
        System.out.println("Propriedade: " + propriedade);
    }
}

*****************************************************************************************************************

 */
	
}

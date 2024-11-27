package _1introducao;

public class HelloWorld {

	    public static void main(String[] args) {
	    	String mensagem = "Hello, Lucas";
	    	System.out.println("Hello, \n World!");
	    	System.out.println(2023);
	    	System.out.println(mensagem);
	    	System.out.println(
	    			"Ctrl + Space é um atalho de autocompletar código; \n"
	    		  + "Ctrl + 1 oferece correções rápidas e sugestões para um problema; \n"
	    		  + "Ctrl + Shift + R \n"
	    		  + "permite que você abra rapidamente \n"
	    		  + "qualquer arquivo no seu projeto. \n"
	    		    );
	  	    	
	    }

}    
	    
	    


	    
	    /*
	     Em Java, o método public static void main(String[] args) é o ponto de entrada para qualquer aplicação Java. 
	     Vamos quebrar o que significa cada parte desta declaração:

         public: Esta é uma palavra-chave de acesso que indica que o método é acessível em 
         qualquer lugar. Isso é necessário porque este método deve ser acessível para que a 
         máquina virtual Java (JVM) possa invocá-lo para iniciar a aplicação.

		 static: Esta é uma palavra-chave que indica que o método pertence à classe em si, 
		 e não a uma instância específica (objeto) da classe. Isso é necessário porque este método é 
		 chamado pela JVM antes de qualquer objeto ser criado.

		 void: Esta é uma palavra-chave que indica que o método não retorna nenhum valor. 
		 Isso é apropriado porque o principal objetivo deste método é iniciar a aplicação; 
		 ele não precisa retornar nenhum valor para a JVM.

		 main: Este é o nome do método. A JVM chama especificamente um método com este nome para iniciar a aplicação.

		 (String[] args): Estes são os parâmetros para o método. args é um array de strings, 
		 que a JVM preenche com quaisquer argumentos de linha de comando que são passados 
		 quando a aplicação é iniciada.

		 Portanto, a declaração public static void main(String[] args) é a maneira em que a JVM 
		 sabe por onde iniciar a execução de um programa Java. Cada aplicativo Java deve ter pelo menos 
		 uma classe com um método main definido desta maneira. 
		 
	     */


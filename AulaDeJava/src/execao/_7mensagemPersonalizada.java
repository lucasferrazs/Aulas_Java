package execao;

public class _7mensagemPersonalizada {
/*
 Personalizar mensagens de erro em Java envolve a criação de classes de exceção personalizadas. 
 Isso permite que você forneça mensagens de erro específicas para diferentes cenários, ajudando na depuração e 
 melhorando a legibilidade do código. Aqui está um exemplo para ilustrar:

Explicação
Em Java, as exceções podem ser personalizadas criando classes que estendem uma das classes de exceção padrão, 
como Exception ou RuntimeException. Você pode incluir métodos e propriedades adicionais ou simplesmente 
uma mensagem de erro mais detalhada.

Exemplo de Código 
 */
	
	// Classe de exceção personalizada
	public class MinhaExcecaoPersonalizada extends Exception {
	    public MinhaExcecaoPersonalizada(String mensagem) {
	        super(mensagem);
	    }
	}

	// Classe principal para demonstração
	public class TesteExcecaoPersonalizada {
	    public static void main(String[] args) {
	        try {
	            validarIdade(15); // Testando com idade inválida
	        } catch (MinhaExcecaoPersonalizada e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }

	    // Método que lança a exceção personalizada
	    public static void validarIdade(int idade) throws MinhaExcecaoPersonalizada {
	        if (idade < 18) {
	            throw new MinhaExcecaoPersonalizada("Idade insuficiente para realizar esta operação.");
	        }
	        System.out.println("Idade válida!");
	    }
	}

}

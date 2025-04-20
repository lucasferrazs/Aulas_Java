package execao;

public class _5palavraschaves {
	public static void main(String[] args) {
	/*As palavras-chave básicas para o tratamento de exceções em Java são try, catch e finally. Cada uma tem um papel específico 
	 * na estrutura de captura e tratamento de erros:

		1. try
		Utilizado para encapsular o código que pode gerar uma exceção.

		Se uma exceção ocorrer dentro do bloco try, ela será "lançada" e poderá ser capturada em um bloco associado.

		Exemplo:
		
		try {
        int resultado = 10 / 0; // Lança ArithmeticException
}
		2. catch
		Utilizado para capturar e tratar exceções lançadas dentro do bloco try.

		Você pode especificar o tipo de exceção que deseja capturar.

		Exemplo:
		catch (ArithmeticException e) {
    	System.out.println("Erro: Divisão por zero.");
    	
    	3. finally
		Opcional, utilizado para executar um código que sempre será executado, independente de ocorrer uma exceção.

		Normalmente usado para liberar recursos, como fechar arquivos ou conexões.

		Exemplo:
		
		finally {
    System.out.println("Bloco 'finally' executado.");
    
    
    
}

}
exemplo completo:
		*/

	try {
	    int resultado = 10 / 0; // Gera uma exceção
	} catch (ArithmeticException e) {
	    System.out.println("Erro capturado: " + e.getMessage());
	} finally {
	    System.out.println("Execução finalizada.");
	}

}
}
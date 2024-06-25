 package _2scanner;
import java.util.Scanner;

public class introducao {
public static void main (String[] args) {
	/*
	 o scanner é ultilizado para fazer a entrada de dados  
	  
	 Antes de usar o Scanner, é preciso importá-lo. 
	 No topo do seu arquivo .java, adicione:
	 import java.util.Scanner;
	 
	 
	 Criando uma Instância de Scanner

	 Para usar o Scanner, você deve criar uma instância do mesmo.
	 */
	Scanner entrada = new Scanner(System.in);
 //Dessa maneira
 // agora acessando o objeto sc podemos ultilizar o scanner
	
	// Métodos Básicos do Scanner
	int num = entrada.nextInt();
	double nummeroReal = entrada.nextDouble();
	String s = entrada.nextLine();
	String palavra = entrada.next();

	/*
	 Problema com nextLine() após nextInt():
	  Se você usar nextLine() após nextInt(), 
	  pode se deparar com problemas. Isso ocorre 
	  porque nextInt() lê apenas o número e não a
	   quebra de linha após ele. Solução comum: 
	  */
	int num2 = entrada.nextInt();
	entrada.nextLine();  // Consumir a quebra de linha não lida
	/*
	 Fechando o Scanner: É uma boa prática fechar o 
	 objeto Scanner após usá-lo para liberar recursos. 
	 Use o método close() 
	 */
	entrada.close();

} 
}

package _2condicional;

public class ifElse {
	public static void main(String[] args){
		/*
		 * A instrução if-else em Java é usada para testar uma condição: se 
		 * a condição for verdadeira, o bloco de código dentro do if é 
		 * executado. Se for falsa, o bloco de código dentro do else é executado.
		 * */
		
/*		if () {
		    // código para ser executado se a condição for verdadeira
		} else {
		    // código para ser executado se a condição for falsa
		}
*/
		//Aqui está um exemplo prático. Suponhamos que temos uma variável chamada 
		//temperatura e queremos verificar se está frio ou quente.
		int temperatura = 20;

		if (temperatura < 18) {
		    System.out.println("Está frio lá fora!");
		} else if (temperatura > 30) {
		    System.out.println("Está muito quente lá fora!");
		} else {
		    System.out.println("Está agradável lá fora!");
		}
	
		//Neste exemplo, se a temperatura for menor que 18, o programa dirá que está frio. 
		//Se for maior que 30, dirá que está muito quente. Caso contrário, dirá que está 
		//agradável.
		
	  int idade = 25;
	  
	  if(idade > 0 && idade <= 12 ) {
		  System.out.println("Você é uma criança");
	  }
	  else if(idade > 12 && idade < 18 ){
		  System.out.println("Você é um adolescente");
	  }
	  else if (idade >= 18 && idade < 60) {
		  System.out.println("Você é um adulto");
	  }
	  else if(idade >= 60) {
		  System.out.println("Você esta na terceira idade");
	  }
	  else {
		  System.out.println("idade invalida");
	  }
	}
}

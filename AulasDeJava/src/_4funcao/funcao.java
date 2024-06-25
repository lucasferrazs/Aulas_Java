
package _4funcao;

public class funcao {
	/*
	Uma função em JAVA é um bloco de código que executa uma 
	tarefa específica e pode ser reutilizado em diferentes 
	partes do programa. Para criar uma função em JAVA, 
	você precisa definir o nome da função, seus parâmetros 
	(se houver) e o tipo de retorno (se houver).
	
	

	[modificador de acesso] [tipo de retorno] NomeDaFuncao([lista de parametros]) 
	{
	    // corpo da função
	    return [valor de retorno];
	}
*/
	/*
	aqui está um exemplo de uma função 
	simples que recebe dois números inteiros 
	como parâmetros e retorna a soma:
	
	public int Soma(int a, int b) {
	    int resultado = a + b;
	    return resultado;
	}
	*/
	/*
	Neste exemplo, a função é chamada "Soma" e tem dois 
	parâmetros do tipo inteiro chamados "a" e "b".
	Dentro do corpo da função, os dois parâmetros são somados e o 
	resultado é armazenado em uma variável chamada "resultado".
	Em seguida, o valor de "resultado" é retornado 
	como o valor de retorno da função.
	*/
/*

	public bool VerificaParidade(int numero) {
	    if (numero % 2 == 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
*/
	/*
	Neste exemplo, a função é chamada "VerificaParidade" 
	e tem um parâmetro do tipo inteiro chamado "numero". 
	Dentro do corpo da função, é verificado se o número é 
	par ou ímpar usando o operador módulo (%). 
	Se o número for par, a função retorna verdadeiro, caso contrário, retorna falso.
	*/


	/*
	Para fazer uma chamada de função devemos criar uma variavel para armazenar
	o valor da função.
	Por exemplo, considere a seguinte função em JAVA que recebe dois números inteiros 
	como parâmetros e retorna a soma dos dois números:
	*/


	
	  // return int
    public static int Soma(int a, int b)
	{
	    int resultado = a + b;
	    return resultado;
	}
	
    
    //return double
    public static double Divisao(double a , double b)
    {	
    if(a != 0 && b != 0) {
    		
    	double resposta = a / b;
    	
    	return resposta ;
    	}
    	else {
    		double resposta = Double.NaN;
    		 return resposta;
    	}
    		
    
    }
    // sem return
    public static void Mensagem(String m) {
    	System.out.println(m);
    }
    
    //return String 
    public static String Palavra(String palavra) {
    	
    	return palavra;
    }
    
    
    public static boolean VerificaParidade(int numero) {
	    if (numero % 2 == 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
  
	    public static void main(String[] args)
	    {
	    	
	    	
	    	int result = Soma(3, 5); // chamada da função do tipo inteiro
	    	int result2 = Soma(10,15); 
	    	int result3 = Soma(15,75); 
	    	int result4 = Soma(12,54); 
	    	int result5 = Soma(86,23); 
	    	int result6 = Soma(2000,789); 
	    	System.out.println(result);
	    	System.out.println(result2);
	    	System.out.println(result3);
	    	System.out.println(result4);
	    	System.out.println(result5);
	    	System.out.println(result6);

	    	double resposta = Divisao(0,10); // chamada de função do tipo double
	    	System.out.println(resposta);
	    	
	    	String teste= "Terceira execução";
	    	Mensagem("Olá mundo"); // chamada de função do  tipo void
	    	Mensagem("Segunda execução");
	    	Mensagem(teste);
	    	String frase = Palavra("Olá mundo 02"); // chamada de função do tipo string
	    	
	    	System.out.println(frase);
	    	boolean parimpar = VerificaParidade(9);
	    	
	    	System.out.println(parimpar);
	 
/*
 * prof.lucasferraz99@gmail.com
 Exercício 1: Escreva uma função em JAVA que receba uma lista de 3 números 
inteiros e retorne o menor e o maior número dessa lista.

Exercício 2: Escreva uma função que aceite um número inteiro e determine 
se ele é um número positivo, negativo ou zero.

Função de potência: Crie uma função chamada Potencia que recebe 
dois parâmetros base e expoente do tipo int. A função 
deve retornar o valor de base elevado à expoente.

Exercício 4: Escreva uma função que aceite um número inteiro e 
retorne o cubo do número.

Exercício 5: Escreva uma função que aceite duas strings e retorne a 
concatenação das duas strings.
*/
	
	    	
	    	
	    	
	    	
	    	
/*
  prof.lucasferraz99@gmail.com
 Escreva uma função que receba dois números inteiros e retorne a soma deles.
 
Crie uma função que converta graus Celsius para Fahrenheit.

Desenvolva uma função que calcule o fatorial de um número inteiro.

Implemente uma função que verifique se um número é primo ou não.

Implemente uma função que calcule a média  de 3 números.

\\
Crie uma função que receba um número inteiro e retorne true se for par e false se for ímpar.

Desenvolva uma função que receba um número inteiro e retorne uma lista com a sequência 
de Fibonacci até esse número.


 */	    	
	    	
	    }
	  
}

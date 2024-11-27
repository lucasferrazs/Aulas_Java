
package _5array;

public class array {
	public static void main(String[] args) {
	/*
	Vetores (também chamados de arrays) em Java são estruturas de dados que
	armazenam uma coleção de 
	elementos do mesmo tipo, acessados por meio de índices.
	Um vetor tem um tamanho fixo, 
	que é definido no momento da criação.
	Aqui está um exemplo de como criar, preencher e acessar 
	elementos de um vetor em JAVA
	*/

	// Cria um vetor de inteiros com tamanho 5.
	// Os índices do vetor variam de 0 a 4 (tamanho - 1).
	int[] numeros = new int[5];

	// Preenche o vetor com valores.
	// Os índices são usados para acessar e atribuir valores aos elementos do vetor.
	numeros[0] = 10;
	numeros[1] = 20;
	numeros[2] = 30;
	numeros[3] = 40;
	numeros[4] = 50;

	// Imprime o valor do elemento no índice 2 do vetor.
	System.out.println("O valor no índice 2 é: " + numeros[2]);

	//soma entre arrays
	int resultado = numeros[0] + numeros[1];
	System.out.println(resultado);

	// Você também pode criar e inicializar um vetor diretamente com valores específicos.
	String[] nomes = new String[] { "Ana", "João", "Maria", "Pedro"};

	// Imprime o valor do elemento no índice 1 do vetor 'nomes'.
	System.out.println("O nome no índice 1 é: " + nomes[1]);


	// Percorre todos os elementos do vetor 'nomes' usando um laço 'for'.
	for (int i = 0; i < nomes.length; i++)
	{
		
	 // A propriedade 'Length' retorna o tamanho do vetor.
	 // Imprime o valor e o índice do elemento atual no console.
		System.out.println("Nome no índice " + i + ": " + nomes[i]);

	}
}
	/*
Invertendo um Array: Escreva um programa que inverte a ordem dos elementos 
de um array de inteiros.
	 
Média dos Valores: Calcule e imprima a média dos valores armazenados em 
um array de números reais.

Encontrando o Máximo: Determine o maior número em um array de inteiros.

Soma dos Elementos: Crie um programa que soma todos os elementos de um array de inteiros.

Contando Pares: Conte quantos números pares existem em um array de inteiros.

Multiplicação de Elementos: Multiplique todos os elementos de um array de inteiros 
por um número fornecido pelo usuário.

Verificando Igualdade: Verifique se dois arrays de inteiros são exatamente iguais.
	 */
}
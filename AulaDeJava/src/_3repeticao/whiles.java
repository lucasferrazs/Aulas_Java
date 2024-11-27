package _3repeticao;

public class whiles {
	public static void main(String[] args){
		/*
 A instrução while é um tipo de loop em Java, que permite repetir um 
 bloco de código enquanto uma certa condição for verdadeira.

 Aqui está a sintaxe básica de uma instrução while: 
  */

//while (condição) {
    // código a ser executado enquanto a condição for verdadeira
//}
/*
 Aqui está um exemplo prático. Suponhamos que queremos imprimir os números de 1 a 10.
 */
int i = 1; // inicializa a variável de controle do loop

while (i <= 10) { // a condição é "i é menor ou igual a 10"
    System.out.println(i); // imprime o valor atual de i
    i++; // incrementa i para o próximo número
}


String resposta = "sim";
while(resposta.equals("sim")) {
	System.out.println("repetindo");
	
	resposta = "não";
}
/*
Neste exemplo, o programa imprimirá os números de 1 a 10. No início de cada iteração 
do loop, ele verifica se i ainda é menor ou igual a 10. Se for, ele imprime o valor de i 
e então incrementa i em 1. Quando i é maior que 10, a condição torna-se falsa e o loop 
termina.

É importante garantir que a condição do loop se torne falsa em algum momento. Caso 
contrário, o loop continuará para sempre, criando um loop infinito, o que geralmente
 é um erro. 
 */
		
	}
}
/*
 prof.lucasferraz99@gmail.com
 
Exercício 1: Imprimindo Números de 1 a 100

Escreva um programa que imprima os números de 1 a 100 na tela.

Exercício 2: Calculando a Soma dos Primeiros 100 Números Naturais

Escreva um programa que calcule e imprima a soma dos primeiros 
100 números naturais. 


exercicio 3 
faça uma calculadora usando if/else ,use o while pra continuar a calcular
caso o usuario digite sim , faça tambem tratamento de erro no else final
e mostre ao usuario quando o algoritmo sair do loop
  */

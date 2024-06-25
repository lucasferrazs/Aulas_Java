package _3repeticao;
import java.util.Scanner;

public class correcaoExercicios {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
//exercicio 01
	/*int i = 0;
	while(i <= 100) {
		System.out.println(i);
		i++;
	}
	*/
	System.out.println("/************************************************/  ");
	
	
// exercicio 02	
	/*int a = 0;
	int inc = 0;
	
	while (inc <= 100) {
		a = a + inc;
		System.out.println(a);
		inc ++;
	}
	
	*/

	String resposta = "sim";
	String op;
	double num1,num2,resultado;

	while(resposta.equals("sim")) {

		System.out.println("operador");
		op = sc.next();
		sc.nextLine();
		System.out.println("Digite o numero 1 : ");
		num1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o numero 2 : ");
		 num2 = sc.nextDouble();
		sc.nextLine();
		if(op.equals("+")){
			resultado = num1 + num2;
			System.out.println(resultado);
		}
		else if(op.equals("-")) {
			resultado = num1 - num2;
			System.out.println(resultado);
		}
		else if(op.equals("*")){
			resultado = num1 * num2;
			System.out.println(resultado);

		}else if(op.equals("/")){
			resultado = num1 / num2;
			System.out.println(resultado);

		}
		else {
			System.out.println("erro");
		}
		
		
		System.out.println("quer continuar? ");
		resposta = sc.next();
		
		
	}
	sc.close();
	System.out.println("encerrou");
}
}

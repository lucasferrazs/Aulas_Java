package _3repeticao;
import java.util.Scanner;
public class teste {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
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
		 switch(op) {
		 case "+" :
			 resultado = num1 + num2;
				System.out.println(resultado);
			 break;
		 case "-" :
			 resultado = num1 - num2;
				System.out.println(resultado);
			 break;
		 case "*" :
			 resultado = num1 * num2;
				System.out.println(resultado);
			 break;
		 case "/" :
			 resultado = num1 / num2;
				System.out.println(resultado);
			 break;
			 
		default:
			System.out.println("ERRO 501");
		 }
		 
		 System.out.println("quer continuar? ");
			resposta = sc.next();
	}
	System.out.println("encerrou");
}
}

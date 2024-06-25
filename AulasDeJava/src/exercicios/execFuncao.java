package exercicios;

public class execFuncao {

	public static void MaiorMenor(int num1, int num2, int num3){
		if(num1 > num2 && num2 > num3) {
			System.out.println("o maior é o " + num1);
			System.out.println("o menor é o " + num3);
		}else if (num1>num2 && num3 > num2) {
			System.out.println("o maior é o " + num1);
			System.out.println("o menor é o " + num2);
		}
	} 
	public static void main(String[] args) {
		MaiorMenor(100,10,20);
	}
}

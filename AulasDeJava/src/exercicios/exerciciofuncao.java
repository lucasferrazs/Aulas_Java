package exercicios;

public class exerciciofuncao {

	/*expoente */
	/*base e repetir pela quantidade de vezes que tiver o expoente*/
	public static int potencia(int base ,int expoente) {
		int i = 1;
		int resultado = base;
		
		while(i < expoente){
		resultado = resultado * base;
			i++;
			
		}
		return resultado;
	}
	
	
	public static void main(String[] args) {
		int respostafuncao = potencia(5,3);
		System.out.println(respostafuncao);
	}
}

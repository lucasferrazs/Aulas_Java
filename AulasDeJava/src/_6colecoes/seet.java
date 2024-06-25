package _6colecoes;
import java.util.HashSet;
import java.util.Set;


	public class seet {
	/*A interface Set define uma coleção que não permite elementos duplicados.
	Ela não possui índices e não garante a ordem dos elementos.
	Exemplo prático:
	*/


	
	    public static void main(String[] args) {
	        Set<Integer> numeros = new HashSet<>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(2); // Não adicionará novamente

	        System.out.println("Números no conjunto:");
	        for (Integer numero : numeros) {
	            System.out.println(numero);
	        }
	    
	}
}

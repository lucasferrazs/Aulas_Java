package _6colecoes;
import java.util.ArrayList;
import java.util.List;

public class list {
	/*A interface List define uma coleção ordenada de elementos, permitindo o acesso aos elementos por meio 
	 de um índice.
	Ela fornece métodos para adicionar, remover e substituir elementos em qualquer posição da lista.
	A implementação mais comum da interface List é o ArrayList.
	Exemplo prático:
	Java
	
	*/

	    public static void main(String[] args) {
	        List<String> nomes = new ArrayList<>();
	        nomes.add("Alice");
	        nomes.add("Bob");
	        nomes.add("Carol");
	        System.out.println( nomes.get(0));
	        nomes.remove(1);
	        System.out.println("Nomes na lista:");
	        for (String nome : nomes) {
	            System.out.println(nome);
	        }
	    
	}
}


package _5array;
import java.util.*;

public class lista_e_colecao {
	public static void main(String[] args) {

	//**Listas**

//	```java
	// Cria uma lista de strings
	List<String> nomes = new ArrayList<>();

	// Adiciona elementos à lista
	nomes.add("João");
	nomes.add("Maria");
	nomes.add("Pedro");

	// Imprime os elementos da lista
	for (String nome : nomes) {
	  System.out.println(nome);
	} // João Maria Pedro

	// Remove um elemento da lista
	nomes.remove("Maria");

	// Verifica se um elemento existe na lista
	System.out.println(nomes.contains("João")); // true
	

//	**Conjuntos**


	// Cria um conjunto de números
	Set<Integer> numeros1 = new HashSet<>();

	// Adiciona elementos ao conjunto
	numeros1.add(1);
	numeros1.add(2);
	numeros1.add(3);

	// Imprime os elementos do conjunto
	for (int numero : numeros1) {
	  System.out.println(numero);
	} // 1 2 3

	// Verifica se um elemento existe no conjunto
	System.out.println(numeros1.contains(2)); // true


//	**Mapas**


	// Cria um mapa de nomes e idades
	Map<String, Integer> pessoas = new HashMap<>();

	// Adiciona elementos ao mapa
	pessoas.put("João", 20);
	pessoas.put("Maria", 25);
	pessoas.put("Pedro", 30);

	// Imprime os elementos do mapa
	for (Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {
	  System.out.println(pessoa.getKey() + " - " + pessoa.getValue());
	} // João - 20 Maria - 25 Pedro - 30

	// Obtém o valor associado a uma chave
	System.out.println(pessoas.get("João")); // 20
	

}
}

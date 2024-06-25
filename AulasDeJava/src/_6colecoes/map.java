package _6colecoes;
import java.util.HashMap;
import java.util.Map;
public class map {
	/*A interface Map representa uma coleção de pares chave-valor.
	Cada chave é única e mapeia para um valor associado.
	Exemplo prático:
	Java
*/       
	
	public static void main(String[] args) {
	 Map<String, Integer> idadePorNome = new HashMap<>();
	 	String chave = "Lucas";
	 	int idade = 24;
	 	idadePorNome.put("Alice", 25);
	 	idadePorNome.put("Bob", 30);
	 	idadePorNome.put("Carol", 28);
	 	idadePorNome.put("B", 28);
	 	idadePorNome.put(chave, idade);
	 	idadePorNome.remove("Carol");
	 	//idadePorNome.remove("Carol");
	 System.out.println("Idade por nome:");
	 for (String nome : idadePorNome.keySet()) {
	   System.out.println(nome + ": " + idadePorNome.get(nome) + " anos");
	        }
	} 

}

/*
 Associar valores a chaves em um HashMap:
Escreva um programa Java que associe um valor específico a uma chave em um HashMap. Por exemplo, 
você pode associar o nome de uma cidade a um código postal. 

Contar o número de mapeamentos chave-valor em um mapa:
Crie um programa que conte quantos pares chave-valor existem em um HashMap.


Copiar elementos de um mapa para outro:
Implemente um programa que copie todos os mapeamentos de um HashMap para outro.
 
 
 Verificar se uma chave específica está presente em um HashMap:
Escreva um código que verifique se uma determinada chave existe em um HashMap.


Criar um mapa com valores de lista:
Crie um programa que utilize um HashMap para armazenar nomes de cidades, onde a chave é o número de caracteres 
no nome da cidade e o valor é uma lista de todas as cidades com esse número de caracteres.
 */
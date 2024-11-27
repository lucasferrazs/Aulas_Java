package _6colecoes;
/*A interface Queue é utilizada para criar uma coleção do tipo FIFO 
(First-In-First-Out), também conhecida como fila.
Exemplo prático:
Java
*/
import java.util.LinkedList;
import java.util.Queue;

public class queue {
		    public static void main(String[] args) {
		        Queue<String> fila = new LinkedList<>();
		        fila.add("Primeiro");
		        fila.add("Segundo");
		        fila.add("Terceiro");

		        System.out.println("Elementos na fila:");
		        while (!fila.isEmpty()) {
		            System.out.println(fila.poll());
		        }
		    }
		}

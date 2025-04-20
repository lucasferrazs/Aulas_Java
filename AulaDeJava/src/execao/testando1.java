package execao;
import java.util.Scanner;
public class testando1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial

        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();
        // TODO: Na linha abaixo, implemente a entrada das três transações:
       
        double transacao1 = scanner.nextDouble();
        scanner.nextLine();
       
        double transacao2 = scanner.nextDouble();
        scanner.nextLine();
      
        double transacao3 = scanner.nextDouble();
        scanner.nextLine();  
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}

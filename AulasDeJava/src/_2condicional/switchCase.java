package _2condicional;

public class switchCase {
public static void main(String[] args) {
	
	/*
	 A declaração switch é uma estrutura de controle de fluxo em Java usada 
	 quando temos várias opções e precisamos executar um bloco diferente de código para 
	 cada opção.

	Aqui está a sintaxe básica de uma declaração switch: 
	
	*/
	
	//switch (variável) {

    //case valor1:
        // código a ser executado se variável == valor1
 //       break;

   // case valor2:
        // código a ser executado se variável == valor2
//        break;

    // ... você pode ter quantos casos quiser ...

    //default:
        // código a ser executado se a variável não for igual a nenhum dos valores acima

/*
 Aqui está um exemplo prático. Suponhamos que temos uma variável 
 chamada diaDaSemana e queremos imprimir uma mensagem diferente para cada dia da semana.
 
 */
	int diaDaSemana = 8; // suponha que 1 seja segunda-feira, 2 seja terça-feira, etc.

	switch (diaDaSemana) {
	    case 1:
	        System.out.println("Segunda-feira - Início da semana de trabalho");
	        break;

	    case 2:
	        System.out.println("Terça-feira");
	        break;

	    case 3:
	        System.out.println("Quarta-feira");
	        break;

	    case 4:
	        System.out.println("Quinta-feira");
	        break;

	    case 5:
	        System.out.println("Sexta-feira - Último dia da semana de trabalho");
	        break;

	    case 6:
	        System.out.println("Sábado - Fim de semana!");
	        break;

	    case 7:
	        System.out.println("Domingo - Fim de semana!");
	        break;

	    default:
	        System.out.println("Dia inválido!");
	}

	/*
	 Neste exemplo, se diaDaSemana for 1, o programa imprimirá "Segunda-feira - 
	 Início da semana de trabalho". Se for 2, imprimirá "Terça-feira", 
	 e assim por diante. Se for qualquer valor que não seja de 1 a 7, 
	 imprimirá "Dia inválido!".

	 A palavra-chave break é usada para sair do bloco switch depois que um
	 caso foi correspondido e seu código foi executado. Se você esquecer de 
	 incluir break, o programa continuará a executar o código para os próximos casos, 
	 mesmo que eles não correspondam à variável. Isso é conhecido como "fallthrough", 
	 e geralmente é um erro. 
	  */
	
	String diaDeSemana = "Segunda";
	
	switch(diaDeSemana) {
	case "Segunda" :
		System.out.println("um otimo dia para iniciar a semana!");
	break;
	
	case "Terça":
		System.out.println("a sexta ainda ta longe?");
	break;
	
	case "Quarta" :
		System.out.println("A semana nao acaba nunca?");
	break;
	
	case "Quinta":
		System.out.println("Ja sinto o cheiro da sexta");
	break;
	
	case "Sexta":
		System.out.println("hoje é dia de maldade");
	break;
	
	default :
		System.out.println("dia da semana invalido");	
	
	}
	
}
}

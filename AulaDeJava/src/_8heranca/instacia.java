package _8heranca;
import java.util.Scanner;

import _8heranca.*;

public class instacia {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	String nome = sc.nextLine();
		Pessoa pessoa01 = new Pessoa("Lucas","777.888.999-55",1999);
		Professor professor01 = new Professor("Lucas","777.888.999-55",1999, 5000, "Programação");
	
		Aluno aluno01 = new Aluno("Lucas","777.888.999-55",2006,"58962");
		aluno01.Andar();
		System.out.println(aluno01.nome +" " + aluno01.cpf+" " 
		+ aluno01.data_nascimento+" " + aluno01.matricula);
		aluno01.Andar();

		professor01.Andar();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*

1- Funcionários e Assistentes:
Implemente a classe Funcionario com os atributos nome, salario e os métodos:
addAumento(double valor): adiciona um aumento ao salário.
ganhoAnual(): calcula o ganho anual do funcionário.
exibeDados(): imprime os valores do funcionário.
Crie a classe Assistente, que também é um funcionário e possui um número de matrícula. 
Sobrescreva o método exibeDados() na classe Assistente.
Crie as classes Tecnico e Administrativo, que herdam de Assistente. Os Assistentes 
Técnicos possuem um bônus salarial, e os Assistentes Administrativos têm um turno (dia ou noite) 
e um adicional noturno. Sobrescreva o método ganhoAnual() em ambas as classes.


2 - Animais 
Implemente as classes:
Animal com os atributos nome e raca, e os métodos:
Animal(): construtor padrão.
Animal(String nome): construtor com parâmetro.
caminha(): retorna uma mensagem sobre como o animal caminha.
Cachorro e Gato, que herdam de Animal. Sobrescreva os métodos late() 
e mia(), respectivamente.

3 - Pessoas
crie a classe pessoas
Pessoas com os atributos nome e idade 
Pessoas(): contrutor padrao
falar(): retorna uma mensagem do que a pessoa esta falando
exibirinfo(): retorna as informações da pessoas
Jogador e tecnico que herdam de Pessoa , 
adicione os atibutos salario e time para ambos 



		  */
	}
}

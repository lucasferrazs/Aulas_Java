package _8heranca;
/*
 A herança em Java é um mecanismo que permite que uma classe adquira 
 propriedades e comportamentos de outra classe já existente. Simplificando, 
 a herança permite criar uma nova classe a partir de outra já existente, herdando 
 a estrutura dessa classe mãe ou superclasse1. Vou explicar com exemplos:
 
 
 Conceito de Herança:
A herança permite criar hierarquias de classes, onde uma classe mais específica 
(subclasse) herda características de uma classe mais geral (superclasse).
A superclasse contém atributos e métodos comuns a várias subclasses.
As subclasses podem adicionar atributos e métodos específicos.
A palavra-chave extends é usada para indicar que uma classe herda de outra.
 */
	
	// Classe Pessoa (Superclasse)
public class Pessoa {
    public String nome;
    public String cpf;
    public int data_nascimento;

    public Pessoa(String _nome, String _cpf, int _data) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.data_nascimento = _data;
    }
   
   public void Andar(){
	   System.out.println("a pessoa anda");
   }
}

//Subclasses Aluno, Professor e Funcionario
 class Aluno extends Pessoa {

    public String matricula;

    public Aluno(String _nome, String _cpf, int _data, String _matricula) {
        super(_nome, _cpf, _data);
        this.matricula = _matricula;
    }
    
  //Override serve para sobreescrever uma função 
 // que é herdada da classe pai
   @Override
	public void Andar(){
		System.out.println("o aluno anda");
	}
    
}

 class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String _nome, String _cpf, int _data, double _salario, 
    		String _disciplina) {
        super(_nome, _cpf, _data);
        this.salario = _salario;
        this.disciplina = _disciplina;
    }
}

 class Funcionario extends Pessoa {
    public double salario;
    public int data_admissao;
    public String cargo;

    public Funcionario(String _nome, String _cpf, int _data, double _salario, 
    	int _dataAdmissao, String _cargo) 
    {
    	super(_nome, _cpf, _data);
        this.salario = _salario;
        this.data_admissao = _dataAdmissao;
        this.cargo = _cargo;
      
    }
}

	
	





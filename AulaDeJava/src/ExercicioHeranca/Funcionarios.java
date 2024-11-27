package ExercicioHeranca;

public class Funcionarios {
	public String nome;
	public double salario;
	
	public Funcionarios(String _nome, double _salario){
		this.nome = _nome;
		this.salario = _salario;
		
	}
	
	public void addAumento(double _aumento){
		this.salario = this.salario + _aumento;

	}
	
	public void ganhoAnual(){
		System.out.println(this.salario * 12);
	}
	
	public void exibirDados(){
		System.out.println(this.nome + " " + this.salario);
	}
}

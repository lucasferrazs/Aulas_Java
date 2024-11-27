package ExercicioHeranca;

public class Assistente extends Funcionarios {
	
	public int matricula;
	
	public Assistente(String _nome,double _salario, int _matricula){
		super(_nome,_salario);
		this.matricula = _matricula;
		
	}
	
	@Override
	public void exibirDados(){
		System.out.println(this.nome + " " + this.salario + " " + this.matricula);
	}

}

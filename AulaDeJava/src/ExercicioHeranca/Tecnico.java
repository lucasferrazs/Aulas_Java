package ExercicioHeranca;

public class Tecnico extends Assistente {
	private double numero;
	private double porcentagem;
	
	public Tecnico(String _nome, double _salario , int _matricula ) {
		super(_nome,_salario,_matricula);
		this.numero = 0;
	}
	@Override
	public void exibirDados(){
		System.out.println(this.nome + " " + this.salario + " " + this.matricula + " " + this.numero);
	}
	
	public void  bonus (int _manutencoes) {
		this.porcentagem = _manutencoes *0.003;
		this.numero = this.salario * porcentagem;
		this.salario = this.salario  + this.numero ;
		
	}
	

	
	

}

package ExercicioHeranca;

public class Conta {

	public int numconta;
	public String titular;
	private double saldo;
	
	public Conta(int _numconta, String _titular){
		this.numconta = _numconta;
		this.titular = _titular;
		this.saldo = 0;
	}
	
	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double exibirSaldo(){
		return this.saldo;
	}
}

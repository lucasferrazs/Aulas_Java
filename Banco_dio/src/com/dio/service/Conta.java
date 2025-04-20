package com.dio.service;
import com.dio.exeptions.saldoInsuficiente;
import com.dio.exeptions.saldoCheque;
public class Conta {
 	public String nomeCliente;
 	public double saldo;
 	public double chequeEspecial;
 	public boolean usaCheque = false;
 	public double saldoDevedor;
 	public double saldoCompleto;
 	
 	
	public Conta(String nomeCliente, double saldo){
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		if(saldo < 500){
			this.chequeEspecial = 50.0;
		}
		else if(saldo >= 500){
			this.chequeEspecial = saldo / 2;
		}
		
	}
	
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) throws saldoInsuficiente {
		if((this.saldo + this.chequeEspecial) < valor) {
			throw new saldoInsuficiente();
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void pagarBoleto(double valor) throws saldoInsuficiente {
		if((this.saldo + this.chequeEspecial) < valor) {
			throw new saldoInsuficiente();
		}else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public double verificarCheque(){
		return this.chequeEspecial;
	}
	
	public String usandoCheque(){
		String mensagem = "";
		if(this.usaCheque){
			mensagem = "Cheque especial está em uso";
		}else {
			mensagem = "Cheque especial não está em uso";
		}
		return mensagem;
	}
	
	public void solicitarCheque (double valor) throws saldoCheque{
		if(this.chequeEspecial - valor >= 0) {
			this.saldo = this.saldo + valor;
			this.chequeEspecial = this.chequeEspecial - valor;
			this.usaCheque = true;
			this.saldoDevedor = this.saldoDevedor + valor  + (valor * 0.20);
		}
		else {
			throw new saldoCheque();
		}
		
	}
	
	public void pagarCheque(double valor) {
		this.saldoDevedor = this.saldoDevedor - valor;
		this.chequeEspecial = this.chequeEspecial + valor;
		if (this.saldoDevedor == 0) {
			this.usaCheque = false;
		}
	}
	
	public void saldoCompleto () {
		System.out.println(this.saldo + this.chequeEspecial);
	}
	
}

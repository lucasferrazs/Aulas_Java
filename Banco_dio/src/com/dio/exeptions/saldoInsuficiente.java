package com.dio.exeptions;

public class saldoInsuficiente extends Exception{
	private static final String mensagem = "Saldo Insuficiente";

	public saldoInsuficiente () {
		super(mensagem);
		
	}
	

}

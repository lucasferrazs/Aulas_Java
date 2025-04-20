package com.dio.exeptions;

public class saldoCheque extends Exception{
	private static final String mensagem = "Sem valor de cheque especial disponivel";

	public saldoCheque() {
		super(mensagem);
		
	}

}

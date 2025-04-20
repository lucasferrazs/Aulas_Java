package com.dio.model;
import com.dio.exeptions.saldoCheque;
import com.dio.exeptions.saldoInsuficiente;
import com.dio.service.*;

public class banco {
public static void main (String[] args) throws saldoInsuficiente, saldoCheque {
  Conta conta1 = new Conta("Lucas",1000);
  System.out.println(conta1.nomeCliente);
  System.out.println(conta1.saldo);
  System.out.println(conta1.chequeEspecial);
  
  conta1.sacar(200);
  System.out.println(conta1.saldo);
  conta1.solicitarCheque(500);
  System.out.println();
  System.out.println(conta1.usandoCheque());
  conta1.pagarCheque(600);
  System.out.println(conta1.usandoCheque());
  conta1.solicitarCheque(100);
  System.out.println(conta1.usandoCheque());
}
}

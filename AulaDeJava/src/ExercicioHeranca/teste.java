package ExercicioHeranca;

public class teste {
public static void main (String[] args) {
	
	Conta minhaConta = new Conta(132456, "Lucas");
	
	System.out.println(minhaConta.titular);
	
	minhaConta.depositar(5000);
	System.out.println(minhaConta.exibirSaldo());
	minhaConta.sacar(1500);
	System.out.println(minhaConta.exibirSaldo());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//teste funcionarios
	/*Funcionarios funcionario01 = new Funcionarios("Lucas", 5600);
	funcionario01.addAumento(400);
    funcionario01.exibirDados();
    funcionario01.ganhoAnual();
    */
    
    //teste Assistente
    /*Assistente funcionario02 = new Assistente("Luciano", 5600 , 4520);
    funcionario02.addAumento(400);
    funcionario02.exibirDados();
    funcionario02.ganhoAnual();
    */
    //teste Tecnico
    /*Tecnico funcionario03 = new Tecnico("Veridiana" , 5600 , 4520);
    funcionario03.addAumento(400);
    funcionario03.bonus(50);
    funcionario03.exibirDados();
    funcionario03.ganhoAnual();
    */
    // teste ADM
    /*
    Administra funcionario04 = new Administra("Lucas", 1000, 4520 , "noite");
    funcionario04.exibirDados();
    funcionario04.ganhoAnual();
    */
    
}
}

package _9conexaoDB;
import java.sql.SQLException;
import java.util.*;
public class comandos {
public static void main(String[] args) throws SQLException {
		
	OperacoesDB comandos = new OperacoesDB();
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("digite o nome ");
	String nome = sc.nextLine();
	System.out.println("digite o email ");
	String email = sc.nextLine();
	
	comandos.insert(nome,email);
	
	
	//comandos.select();

	
	//comandos.delete(1);
	//comandos.update("deu booooooooooaaaaaaaaaaaaaaaa",2);
	
	
}
}


/*
 fazer select em todas as tabelas 
 insert na tabela compra e venda (as tabelas autor e adm adicionar pelo mysql)
   fazer update em todas as tabelas 
    fazer delete em todas as tabelas 
 */












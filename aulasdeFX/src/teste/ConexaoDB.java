package teste;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

			public class ConexaoDB {
			    private static final String URL = "jdbc:mysql://localhost:3306/teste";
			    private static final String USER = "root";
			    private static final String PASSWORD = "";

			    public static Connection getConexao() {
			        try {
			            return DriverManager.getConnection(URL, USER, PASSWORD);
			        } catch (SQLException e) {
			            throw new RuntimeException("Erro na conexão com o Banco de Dados!", e);
			        }
			    }
			}
		   
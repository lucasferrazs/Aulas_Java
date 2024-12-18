package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperacoesDB {
	public List<String[]> select() {
	    String sql = "SELECT * FROM conta";
	    List<String[]> resultados = new ArrayList<>();
	    try (
	        // estabeleca a conexão do banco de dados	
	        Connection conn = ConexaoDB.getConexao();
	        // prepara os o comando sql a ser executado	
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        // rs recebe a execução da query	
	        ResultSet rs = stmt.executeQuery()) {

	        while (rs.next()) {
	            // Processa os resultados
	            String titular = rs.getString("titular");
	            String valor = rs.getString("saldo");
	            resultados.add(new String[]{titular, valor});
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return resultados;
	}

    public void insertConta(String nome, double email) {
        String sql = "INSERT INTO conta (titular,saldo) VALUES (?,?)";
        try (Connection conn = ConexaoDB.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setDouble(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
        public void insertRceita(double valor, int fk) {
            String sql = "INSERT INTO receita (valor,fk_conta) VALUES (?,?)";
            try (Connection conn = ConexaoDB.getConexao();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setDouble(1, valor);
                stmt.setInt(2, fk);
                stmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                
            }
        }
            public void insertDespesa(double valor, int fk) {
                String sql = "INSERT INTO despesa (valor,fk_conta) VALUES (?,?)";
                try (Connection conn = ConexaoDB.getConexao();
                     PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setDouble(1, valor);
                    stmt.setInt(2, fk);
                    stmt.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                    
                }
    }
    
    public void delete (int iddeletado){
    	String sql = "delete from usuario where id = ?" ;
    	try(Connection conn = ConexaoDB.getConexao();
    		PreparedStatement stmt = conn.prepareStatement(sql)){
    		stmt.setInt(1, iddeletado);
    		int rowsAffected = stmt.executeUpdate();
            System.out.println(rowsAffected + " linhas deletadas.");
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    public void update(String nome ,int idupdate ) throws SQLException {
    String sqlUpdate = "UPDATE usuario SET nome = ?  WHERE id = ?";
    try (
    	Connection conn = ConexaoDB.getConexao();
    	PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
        pstmtUpdate.setString(1, nome);
        pstmtUpdate.setInt(2, idupdate); // ID do registro a ser atualizado
        int rowsAffected = pstmtUpdate.executeUpdate();
        System.out.println(rowsAffected + " linhas atualizadas.");
    }catch(SQLException e) {
		e.printStackTrace();
	}
    
    }
 
    // Métodos para DELETE e UPDATE seguem uma lógica similar ao INSERT
}

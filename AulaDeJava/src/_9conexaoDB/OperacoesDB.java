package _9conexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperacoesDB {
    public void select() {
        String sql = "SELECT * FROM usuario";
        try (
        	// estabeleca a conexão do banco de dados	
        	 Connection conn = ConexaoDB.getConexao();
        	// prepara os o comando sql a ser executado	
             PreparedStatement stmt = conn.prepareStatement(sql);
        	// rs recebe a execução da query	
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Processa os resultados
            	String nomef = rs.getString("nome");
            	String email = rs.getString("email");
            	
            	System.out.println("deu boa " + nomef +" e o email é " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(String nome, String email) {
        String sql = "INSERT INTO usuario (nome,email) VALUES (?,?)";
        try (Connection conn = ConexaoDB.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
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

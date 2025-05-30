package teste;
import java.sql.SQLException;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class comandos extends Application {
	OperacoesDB comandossql = new OperacoesDB();

	
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	  VBox root = new VBox(10);
      root.setPadding(new Insets(10));
      root.setAlignment(Pos.CENTER);
	
	 // Criar um Label
    Label mensagem1 = new Label("Digite primeiro campo");
    root.getChildren().add(mensagem1);

    // Criar um TextField
    TextField usuario = new TextField();
    root.getChildren().add(usuario);

    
    // Criar um Label
    Label mensagem2 = new Label("Digite o segundo campo");
    root.getChildren().add(mensagem2);

    // Criar um TextField
    TextField email = new TextField();
    root.getChildren().add(email);
    
    
    Button button = new Button("CONTA");
    button.setOnAction(e -> {
       Double valor = Double.parseDouble(email.getText()); 
       comandossql.insertConta(usuario.getText(), valor);
       System.out.println("enviado com sucesso");
       Label mensagem3 = new Label("enviado com sucesso");
       root.getChildren().add(mensagem3);
       usuario.setText("");
       email.setText(""); 
    });
    root.getChildren().add(button);
    
    Button botao = new Button("RECEITA");
    botao.setOnAction(e -> {
       Double valor = Double.parseDouble(usuario.getText());
       int fk = Integer.parseInt(email.getText());
       
       comandossql.insertRceita(valor, fk);
       System.out.println("enviado com sucesso");
       Label mensagem3 = new Label("enviado com sucesso");
       root.getChildren().add(mensagem3);
       usuario.setText("");
       email.setText(""); 
    });
    root.getChildren().add(botao);
    
    
    Button botao2 = new Button("Despesa");
    botao2.setOnAction(e -> {
       Double valor = Double.parseDouble(usuario.getText());
       int fk = Integer.parseInt(email.getText());
       
       comandossql.insertDespesa(valor, fk);
       System.out.println("enviado com sucesso");
       Label mensagem3 = new Label("enviado com sucesso");
       root.getChildren().add(mensagem3);
       usuario.setText("");
       email.setText(""); 
    });
    root.getChildren().add(botao2);
    
    Button botao3 = new Button("SELECT");
    botao3.setOnAction(e -> {
        List<String[]> resultados = comandossql.select();
        
        if (!resultados.isEmpty()) {
            for (String[] row : resultados) {
                Label label = new Label("Titular: " + row[0] + ", Valor: " + row[1]);
                // Add the label to your scene or layout
                root.getChildren().add(label);
            }
        } else {
            Label label = new Label("Nenhum resultado encontrado");
            // Add the label to your scene or layout
            root.getChildren().add(label);
        }
        
        
    });
    root.getChildren().add(botao3);
    
    // Criar uma cena e uma janela
    Scene scene = new Scene(root, 300, 250);
    primaryStage.setTitle("banco de dados");
    primaryStage.setScene(scene);
    primaryStage.show();
}

public static void main(String[] args) throws SQLException {
	

    launch(args);
	
}
}




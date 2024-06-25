package teste;
import java.sql.SQLException;


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
    Label mensagem1 = new Label("Digite seu nome");
    root.getChildren().add(mensagem1);

    // Criar um TextField
    TextField usuario = new TextField();
    root.getChildren().add(usuario);

    
    // Criar um Label
    Label mensagem2 = new Label("Digite seu email");
    root.getChildren().add(mensagem2);

    // Criar um TextField
    TextField email = new TextField();
    root.getChildren().add(email);
    
    
    Button button = new Button("Enviar");
    button.setOnAction(e -> {
       comandossql.insert(usuario.getText(), email.getText());
       System.out.println("enviado com sucesso");
       Label mensagem3 = new Label("enviado com sucesso");
       root.getChildren().add(mensagem3);
       usuario.setText("");
       email.setText(""); 
    });
    root.getChildren().add(button);
    
    
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



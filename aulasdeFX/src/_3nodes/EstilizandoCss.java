package _3nodes;
/*
 Estilizar Nós com CSS em JavaFX

Em JavaFX, você pode estilizar nós usando CSS, o que permite separar a lógica de 
apresentação da lógica de negócios. Isso torna mais fácil manter e atualizar 
a aparência da sua aplicação.

Como usar CSS em JavaFX

Para usar CSS em JavaFX, você precisa seguir os seguintes passos:

Criar um arquivo CSS que contenha as regras de estilo para os nós.
Adicionar o arquivo CSS à sua aplicação JavaFX.
Atribuir IDs ou classes CSS aos nós que você deseja estilizar.
*/
	
	
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;

	public class EstilizandoCss extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	        StackPane root = new StackPane();
	        Scene scene = new Scene(root, 300, 250);
	        // Adicionar o arquivo CSS à cena
	        scene.getStylesheets().add(getClass().getResource("Botao.css").toExternalForm());
	     
	        // Criar um botão e atribuir a classe CSS
	        Button button = new Button("Clique em mim!");
	        button.getStyleClass().add("botaoo");

	        root.getChildren().add(button);

	        //scene.getStylesheets().add("Botao.css");
	     
	        //root.getStylesheets().add(getClass().getResource("Botao.css").toExternalForm());

	        primaryStage.setTitle("Estilizar Botão com CSS");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	        /*
 Nesse exemplo, criamos um arquivo CSS chamado Botao.css que define os estilos 
 para o botão. Em seguida, criamos um botão em JavaFX e atribuímos a classe CSS 
 button ao botão usando o método getStyleClass().add(). Por fim, adicionamos o 
 arquivo CSS à cena usando o método getStylesheets().add(). 
	         */
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


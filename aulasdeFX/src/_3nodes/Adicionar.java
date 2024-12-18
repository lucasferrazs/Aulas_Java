package _3nodes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Adicionar extends Application{
/*
Adicionar Nós à Cena JavaFX

Para adicionar um nó à cena JavaFX, você pode usar o método getChildren() da classe 
Pane, que retorna uma lista observável de nós. Em seguida, você pode usar o método 
add() para adicionar um novo nó à lista. 
  */
	

	    @Override
	    public void start(Stage primaryStage) {
	        StackPane root = new StackPane();
	        Scene scene = new Scene(root, 300, 250);

	        Button button = new Button("Clique em mim!");
	        root.getChildren().add(button); // Adiciona o botão à cena

	        primaryStage.setTitle("Adicionar Nó Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	        
	 /*
Nesse exemplo, criamos um StackPane como o nó raiz da cena e, em seguida, adicionamos um 
nó Button a ele usando o método getChildren().add()
	 */
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	}


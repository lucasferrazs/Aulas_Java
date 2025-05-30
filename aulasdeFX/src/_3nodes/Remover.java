package _3nodes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Remover extends Application{
/*
 Remover Nós da Cena JavaFX

 Para remover um nó da cena JavaFX, você pode usar o método remove() 
 da lista observável retornada por getChildren(). 
 */
	
	    @Override
	    public void start(Stage primaryStage) {
	        StackPane root = new StackPane();
	        Scene scene = new Scene(root, 300, 250);

	        Button button = new Button("Clique em mim!");
	        root.getChildren().add(button); // Adiciona o botão à cena

	        // Remove o botão da cena
	        root.getChildren().remove(button);

	        primaryStage.setTitle("Remover Nó Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


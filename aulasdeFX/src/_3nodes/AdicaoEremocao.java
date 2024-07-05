package _3nodes;

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.StackPane;
	import javafx.stage.Stage;

	public class AdicaoEremocao extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	        StackPane root = new StackPane();
	        Scene scene = new Scene(root, 300, 250);

	        Button addButton = new Button("Adicionar Nó");
	        addButton.setOnAction(e -> {
	            Button newNode = new Button("Novo Nó!");
	            root.getChildren().add(newNode);
	        });

	        Button removeButton = new Button("Remover Nó");
	        removeButton.setOnAction(e -> {
	            if (!root.getChildren().isEmpty()) {
	                root.getChildren().remove(0);
	            }
	        });

	        root.getChildren().addAll(addButton, removeButton);

	        primaryStage.setTitle("Adicionar Remover Nó Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


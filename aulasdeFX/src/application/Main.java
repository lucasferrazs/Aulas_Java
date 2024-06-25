package application;
	

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    // Método init()
    @Override
    public void init() {
        // Código de inicialização aqui
    }

    // Método start(), ponto de entrada principal
    @Override
    public void start(Stage primaryStage) {
   

        // Criando um componente de interface (UI component)
        Label label = new Label("Olá, mundo do JavaFX!");
        Label label2 = new Label("Foda-se a 303 ");
        // Preparando o layout
        StackPane root = new StackPane();
        root.getChildren().add(label);
        root.getChildren().add(label2);
        // Configurando a cena
        Scene scene = new Scene(root, 300, 250);

        // Configurando o palco
        primaryStage.setTitle("Exemplo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método stop()
    @Override
    public void stop() {
        System.out.println("Dentro do método stop()");
        // Código de limpeza aqui
    }

    public static void main(String[] args) {
        launch(args);
    }
}



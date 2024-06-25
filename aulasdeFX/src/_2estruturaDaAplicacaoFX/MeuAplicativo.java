package _2estruturaDaAplicacaoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class MeuAplicativo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Cria a cena
        Scene scene = new Scene(new VBox(10), 300, 200);

        // Cria os nodes
        Label label = new Label("Olá, Mundo!");
        Button button = new Button("Clique aqui!");

        // Adiciona os nodes à cena
        VBox root = (VBox) scene.getRoot();
        root.getChildren().addAll(label, button);

        // Configura o stage
        primaryStage.setTitle("Meu Aplicativo");
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


/*
 Explicação

A classe MeuAplicativo estende Application e implementa o método start(Stage primaryStage).
No método start, criamos uma cena (Scene) com um VBox como nó raiz.
Criamos dois nodes: um Label e um Button.
Adicionamos os nodes à cena usando o método getChildren().addAll() do VBox.
Configuramos o stage (primaryStage) com um título e a cena criada.
Mostramos o stage com o método show().
Estrutura

MeuAplicativo (Application)
start(Stage primaryStage)
Scene (cena)
VBox (node raiz)
Label (node)
Button (node)
primaryStage (stage)
 */
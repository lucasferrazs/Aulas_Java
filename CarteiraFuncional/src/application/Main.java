package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textocapturado = new TextField();
        Label label = new Label();
        Button botao = new Button("Mostrar Nome");

        botao.setOnAction(e -> {
            String nome = textocapturado.getText();
            label.setText("Olá, " + nome);
        });

        VBox vbox = new VBox(textocapturado, botao, label);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



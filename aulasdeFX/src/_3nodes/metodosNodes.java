package _3nodes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.shape.Rectangle;
public class metodosNodes extends Application {

/*
 Em JavaFX, os nós (nodes) são objetos gráficos que podem ser adicionados a um layout 
 e exibidos em uma janela. Existem várias propriedades e métodos comuns que podem ser 
 usados para personalizar a aparência e o comportamento dos nós. Aqui estão algumas das 
 propriedades e métodos mais comuns:
 

 */
	@Override
	public void start(Stage primaryStage) {
		  Scene scene = new Scene(new VBox(10), 300, 200);
		  VBox root = (VBox) scene.getRoot();
		/*
		  
		Texto:
		
		setText(String text): Define o texto do nó.
		getText(): Retorna o texto do nó.
		 */
		Label label = new Label();
		label.setText("Olá, mundo!");
		root.getChildren().add(label);
	

		/*
		Cor:

		setFill(Paint fill): Define a cor de preenchimento do nó.
		getFill(): Retorna a cor de preenchimento do nó.
		 */
		Rectangle rectangle = new Rectangle();
		rectangle.setFill(javafx.scene.paint.Color.RED);
	
		System.out.println(rectangle.getFill()); // imprime "javafx.scene.paint.Color@... (red)"

		/*
		  
		Tamanho:
		
		setWidth(double width): Define a largura do nó.
		setHeight(double height): Define a altura do nó.
		getWidth(): Retorna a largura do nó.
		getHeight(): Retorna a altura do nó.
		 */
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setWidth(100);
		rectangle2.setHeight(50);
		System.out.println(rectangle2.getWidth()); // imprime 100.0
		System.out.println(rectangle2.getHeight()); // imprime 50.0
	
		/*
		  
		Posição:
		
		setLayoutX(double x): Define a posição x do nó na cena.
		setLayoutY(double y): Define a posição y do nó na cena.
		getLayoutX(): Retorna a posição x do nó na cena.
		getLayoutY(): Retorna a posição y do nó na cena.
		 */
		Label label2 = new Label();
		label2.setLayoutX(100);
		label2.setLayoutY(50);
		System.out.println(label2.getLayoutX()); // imprime 100.0
		System.out.println(label2.getLayoutY()); // imprime 50.0

		/*
		  
		Visibilidade:
		
		setVisible(boolean visible): Define se o nó é visível ou não.
		isVisible(): Retorna se o nó é visível ou não.
		 */
		Label label3 = new Label();
		label3.setVisible(false);
		System.out.println(label3.isVisible()); // imprime false

		/*
		  
		Habilitação:
		
		setDisable(boolean disable): Define se o nó está habilitado ou não.
		isDisable(): Retorna se o nó está habilitado ou não.
		 */
		Button button = new Button("Botão");
		button.setDisable(true);
		System.out.println(button.isDisable()); // imprime true
		root.getChildren().add(button);
		
		   primaryStage.setTitle("Meu Aplicativo");
	        primaryStage.setScene(scene);
	        primaryStage.show();
    }
	 
	public static void main(String[] args) {
	    launch(args);
	}
}


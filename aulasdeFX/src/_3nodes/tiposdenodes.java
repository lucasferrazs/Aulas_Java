package _3nodes;
	import javafx.application.Application;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.Label;
    import javafx.scene.control.Labeled;
    import javafx.scene.control.RadioButton;
	import javafx.scene.control.TextField;
	import javafx.scene.control.ToggleGroup;
	import javafx.scene.layout.VBox;
	import javafx.stage.Stage;

	public class tiposdenodes extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	        // Criar um VBox para organizar os Nodes
	        VBox root = new VBox(10);
	        root.setPadding(new Insets(10));
	        root.setAlignment(Pos.CENTER);

	        // Criar um Label
	        Label mensagem = new Label("Digite seu nome:");
	        root.getChildren().add(mensagem);

	        // Criar um TextField
	        TextField campoTexto = new TextField();
	        root.getChildren().add(campoTexto);

	        // Criar um CheckBox
	        CheckBox checkBox = new CheckBox("Aceito os termos de uso");
	        root.getChildren().add(checkBox);

	        // Criar um RadioButton
	        ToggleGroup radioGroup = new ToggleGroup();
	        RadioButton radio1 = new RadioButton("Opção 1");
	        radio1.setToggleGroup(radioGroup);
	        root.getChildren().add(radio1);

	        RadioButton radio2 = new RadioButton("Opção 2");
	        radio2.setToggleGroup(radioGroup);
	        root.getChildren().add(radio2);

	        // Criar um Button
	        Button button = new Button("Enviar");
	        button.setOnAction(e -> {
	            System.out.println("Nome: " + campoTexto.getText());
	            System.out.println("Aceito termos: " + checkBox.isSelected());
	            System.out.println("Opção selecionada: "
	            + ((Labeled) radioGroup.getSelectedToggle()).getText());
	        });
	        root.getChildren().add(button);

	        // Criar uma cena e uma janela
	        Scene scene = new Scene(root, 300, 250);
	        primaryStage.setTitle("Node Example");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
	
/*
 No JavaFX, um Node é um elemento gráfico que pode ser adicionado à 
 cena. Existem vários tipos de Nodes, cada um com suas próprias 
 características e propósitos. Aqui estão alguns dos principais tipos de Nodes:

1. Label
Um Label é um Node que exibe texto. Ele é usado para exibir informações para o usuário.

Propriedades: text, font, fontSize, fontWeight, etc.
Métodos: setText(), getText(), setFont(), etc.

2. Button
Um Button é um Node que permite ao usuário interagir com o aplicativo. Ele pode ser usado 
para executar ações quando clicado.

Propriedades: text, graphic, onPressed, onReleased, etc.
Métodos: setText(), setGraphic(), setOnAction(), etc.

3. TextField
Um TextField é um Node que permite ao usuário inserir texto. Ele é usado para coletar 
informações do usuário.

Propriedades: text, promptText, editable, etc.
Métodos: setText(), getText(), setPromptText(), etc.

4. TextArea
Um TextArea é um Node que permite ao usuário inserir texto em múltiplas linhas. Ele 
é usado para coletar informações do usuário em forma de texto longo.

Propriedades: text, promptText, editable, wrapText, etc.
Métodos: setText(), getText(), setPromptText(), etc.
5. ImageView

Um ImageView é um Node que exibe uma imagem. Ele é usado para exibir imagens 
em um aplicativo.

Propriedades: image, fitWidth, fitHeight, etc.
Métodos: setImage(), getImage(), setFitWidth(), etc.
6. CheckBox

Um CheckBox é um Node que permite ao usuário selecionar opções. Ele é usado para coletar 
informações do usuário em forma de seleção.

Propriedades: text, selected, indeterminate, etc.
Métodos: setSelected(), isSelected(), setIndeterminate(), etc.
7. RadioButton

Um RadioButton é um Node que permite ao usuário selecionar uma opção entre várias. 
Ele é usado para coletar informações do usuário em forma de seleção.

Propriedades: text, selected, toggleGroup, etc.
Métodos: setSelected(), isSelected(), setToggleGroup(), etc.
8. ComboBox

Um ComboBox é um Node que permite ao usuário selecionar uma opção entre várias. 
Ele é usado para coletar informações do usuário em forma de seleção.

Propriedades: items, value, editable, etc.
Métodos: getItems(), getValue(), setEditable(), etc.
9. ListView

Um ListView é um Node que exibe uma lista de itens. Ele é usado para exibir informações em forma de lista.

Propriedades: items, selectionModel, etc.
Métodos: getItems(), getSelectionModel(), etc.
10. TableView

Um TableView é um Node que exibe uma tabela de dados. Ele é usado para exibir informações em forma de tabela.

Propriedades: items, columns, selectionModel, etc.
Métodos: getItems(), getColumns(), getSelectionModel(), etc.
Esses são apenas alguns dos principais tipos de Nodes do JavaFX. Existem muitos outros, como Slider, ProgressBar, Hyperlink, etc.
 */


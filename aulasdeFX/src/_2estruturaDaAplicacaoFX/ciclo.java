package _2estruturaDaAplicacaoFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class ciclo {
/*
 O ciclo de vida de um aplicativo JavaFX é composto por três métodos principais: init(), start(), e stop(). 
 Esses métodos são chamados em uma ordem específica quando o aplicativo é iniciado, executado e fechado.

1. init()

O método init() é chamado quando o aplicativo é iniciado, antes de criar a interface do usuário. Este método 
é usado para inicializar recursos, carregar dados, ou realizar tarefas de inicialização antes de criar a cena.

É chamado apenas uma vez, quando o aplicativo é iniciado.
É um bom lugar para inicializar recursos, como conexões de banco de dados ou carregar dados de configuração.

2. start()

O método start() é chamado após o método init() e é responsável por criar a interface do usuário. Este método 
é usado para criar a cena, adicionar nodes à cena, e configurar a janela.

É chamado apenas uma vez, após o método init().
É um bom lugar para criar a interface do usuário, adicionar nodes à cena, e configurar a janela.
3. stop()

O método stop() é chamado quando o aplicativo é fechado. Este método é usado para realizar tarefas de limpeza, 
como fechar conexões de banco de dados, liberar recursos, ou salvar dados.

É chamado apenas uma vez, quando o aplicativo é fechado.
É um bom lugar para realizar tarefas de limpeza e fechar recursos.
Ordem de chamada

A ordem de chamada dos métodos é a seguinte:

init()
start()
stop() (quando o aplicativo é fechado)


 */
	
	
	
	
	public class MeuAplicativo extends Application {
	    @Override
	    public void init() {
	        System.out.println("Iniciando aplicativo...");
	        // Inicializar recursos aqui
	    }

	    @Override
	    public void start(Stage primaryStage) {
	        System.out.println("Criando interface do usuário...");
	        // Criar interface do usuário aqui
	    }

	    @Override
	    public void stop() {
	        System.out.println("Fechando aplicativo...");
	        // Realizar tarefas de limpeza aqui
	    }
	    /*
	     O ciclo de vida de um aplicativo JavaFX é composto por três métodos principais: 
	     init(), start(), e stop(). 
	     Esses métodos são chamados em uma ordem específica quando o aplicativo é iniciado, 
	     executado e fechado. Entender o ciclo de vida do aplicativo é fundamental para criar 
	     aplicativos JavaFX robustos e eficientes.
	     */
	}
}

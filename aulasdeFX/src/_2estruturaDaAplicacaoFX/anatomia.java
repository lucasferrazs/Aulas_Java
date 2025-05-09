package _2estruturaDaAplicacaoFX;

public class anatomia {
/*
 Application

A classe Application é a classe base para todos os aplicativos JavaFX.
Ela é responsável por inicializar o aplicativo e fornecer um ponto de 
entrada para o ciclo de vida do aplicativo.
A classe Application é abstrata e deve ser estendida por uma classe concreta 
que implemente o método start(Stage primaryStage).
O método start é chamado quando o aplicativo é iniciado e é responsável 
por criar a interface gráfica do aplicativo.

Stage
A classe Stage representa a janela principal do aplicativo.
É o contêiner mais alto nível que contém a cena e os nodes.
Um aplicativo JavaFX pode ter múltiplos stages, mas apenas um pode ser 
o stage primário. O stage é responsável por gerenciar a vida útil da 
cena e dos nodes. 
Propriedades do Stage:
Título: o título da janela.
Cena: a cena que é renderizada na janela.
Visibilidade: indica se a janela está visível ou não.
Posição: a posição da janela na tela.

Scene

A classe Scene representa a cena gráfica que é renderizada no stage.
É o contêiner que contém os nodes que compõem a interface gráfica do 
aplicativo. A cena é responsável por gerenciar a layout e a renderização dos nodes.
Propriedades da Scene:
Root: o nó raiz da cena.
Estilo: o estilo da cena (por exemplo, cor de fundo).
Tamanho: o tamanho da cena.

Node

A classe Node é a classe base para todos os componentes gráficos do JavaFX.
É o elemento mais básico que compõe a cena e pode ser um controle, um gráfico, 
uma imagem, um texto, etc.
Os nodes podem ser adicionados à cena e podem ter propriedades e estilos customizados.
Propriedades do Node:
Posição: a posição do node na cena.
Tamanho: o tamanho do node.
Estilo: o estilo do node (por exemplo, cor de fundo).
Eventos: os eventos que o node pode disparar (por exemplo, clique, hover).
Relação entre eles

Um aplicativo JavaFX tem uma instância de Application que é o ponto de entrada 
do aplicativo.
A instância de Application cria um Stage primário que é a janela principal 
do aplicativo.
O Stage contém uma Scene que é a cena gráfica renderizada na janela.
A Scene contém múltiplos Nodes que compõem a interface gráfica do aplicativo.
Exemplo

Suponha que você queira criar um aplicativo JavaFX que exiba uma janela 
com um botão e um label.  A anatomia do aplicativo seria a seguinte:

Application: a classe que estende Application e implementa o método start
(Stage primaryStage).
Stage: a janela principal do aplicativo que contém a cena.
Scene: a cena gráfica que contém os nodes (botão e label).
Nodes: o botão e o label que compõem a interface gráfica do aplicativo. 
  */
}

package testedoXml;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;

public class ManipularXml {

	public static void main(String[] args) {
        try {
            // Carregar o documento XML
            File xmlFile = new File("src/testedoXml/livros.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

         // Navegar na árvore DOM
            NodeList livroList = document.getElementsByTagName("livro");
            for (int i = 0; i < livroList.getLength(); i++) {
                Element livro = (Element) livroList.item(i);
                String titulo = livro.getElementsByTagName("titulo").item(0).getTextContent();
                String autor = livro.getElementsByTagName("autor").item(0).getTextContent();
                String ano = livro.getElementsByTagName("ano").item(0).getTextContent();

                System.out.println("Livro " + (i + 1) + ":");
                System.out.println("Título: " + titulo);
                System.out.println("Autor: " + autor);
                System.out.println("Ano: " + ano);
                System.out.println();
            }

            // Adicionar um novo livro
            Element novoLivro = document.createElement("livro");
            Element novoTitulo = document.createElement("titulo");
            novoTitulo.setTextContent("O Senhor dos Anéis");
            Element novoAutor = document.createElement("autor");
            novoAutor.setTextContent("J.R.R. Tolkien");
            Element novoAno = document.createElement("ano");
            novoAno.setTextContent("1954");

            novoLivro.appendChild(novoTitulo);
            novoLivro.appendChild(novoAutor);
            novoLivro.appendChild(novoAno);

            // Adicionar o novo livro ao elemento raiz
            document.getDocumentElement().appendChild(novoLivro);

            // Salvar as alterações em um novo arquivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("livros_atualizados.xml"));
            transformer.transform(source, result);

            System.out.println("Novo livro adicionado e arquivo salvo como 'livros_atualizados.xml'.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
	/*
Explicação do Código
Carregar o Documento XML: O código carrega o arquivo livros.xml usando DocumentBuilderFactory e DocumentBuilder.

Navegar na Árvore DOM: O código obtém todos os elementos livro e itera sobre eles, extraindo e imprimindo os valores de titulo, autor e ano.

Adicionar um Novo Livro: Um novo elemento livro é criado, junto com seus elementos filhos (titulo, autor, ano). Esses elementos são adicionados ao novo livro.

Adicionar o Novo Livro ao Elemento Raiz: O novo livro é anexado ao elemento raiz (livros).

Salvar as Alterações: O código usa Transformer para salvar o documento atualizado em um novo arquivo chamado livros_atualizados.xml.

7. Exemplos Práticos
Objetivo: Aplicar o que foi aprendido em exemplos práticos.
Tópicos:
Criar um projeto que lê um arquivo XML, valida contra um XSD e exibe os dados.
Implementar um CRUD (Create, Read, Update, Delete) simples usando XML e XSD.
Trabalhar com arquivos XML mais complexos e aninhados.
8. Trabalhando com Ferramentas e Bibliotecas
Objetivo: Aprender a usar ferramentas e bibliotecas para trabalhar com XML e XSD.
Tópicos:
Usar bibliotecas como JAXB (Java Architecture for XML Binding) para mapear XML para objetos Java.
Usar ferramentas de edição XML (como Oxygen XML Editor ou XMLSpy).
Explorar ferramentas de validação de XML e XSD.
9. Recursos Adicionais
Objetivo: Continuar aprendendo e se atualizando sobre XML e XSD.
Tópicos:
Documentação oficial sobre XML e XSD.
Livros e tutoriais online sobre XML e XSD.
Comunidades e fóruns para discutir dúvidas e compartilhar conhecimento. 
	 */


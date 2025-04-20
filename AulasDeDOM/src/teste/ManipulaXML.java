package teste;


import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ManipulaXML {
    public static void main(String[] args) {
        try {
            // Passo 1: Ler o arquivo XML
            File arquivoXML = new File("src/teste/exemplo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(arquivoXML);
            doc.getDocumentElement().normalize();

            // Passo 2: Imprimir os títulos dos livros
            NodeList nList = doc.getElementsByTagName("livro");
            System.out.println("Lista de Livros:");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) node;
                    String titulo = elemento.getElementsByTagName("titulo").item(0).getTextContent();
                    System.out.println("Título: " + titulo);
                }
            }

            // Passo 3: Criar um novo livro
            Element novoLivro = doc.createElement("livro");

            Element novoTitulo = doc.createElement("titulo");
            novoTitulo.appendChild(doc.createTextNode("Programação em Python"));
            novoLivro.appendChild(novoTitulo);

            Element novoAutor = doc.createElement("autor");
            novoAutor.appendChild(doc.createTextNode("Ana Costa"));
            novoLivro.appendChild(novoAutor);

            Element novoAno = doc.createElement("ano");
            novoAno.appendChild(doc.createTextNode("2023"));
            novoLivro.appendChild(novoAno);

            // Adicionar o novo livro ao elemento raiz
            doc.getDocumentElement().appendChild(novoLivro);

            // Passo 4: Salvar as alterações de volta no arquivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/teste/exemplo.xml"));
            transformer.transform(source, result);

            System.out.println("Novo livro adicionado: Programação em Python, Ana Costa, 2023.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ManipulaXML {
    public static void main(String[] args) {
        try {
            // Passo 1: Ler o arquivo XML
            File arquivoXML = new File("src/teste/exemplo.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(arquivoXML);
            doc.getDocumentElement().normalize();

            // Passo 2: Imprimir os títulos dos livros
            NodeList nList = doc.getElementsByTagName("livro");
            System.out.println("Lista de Livros:");
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) node;
                    String titulo = elemento.getElementsByTagName("titulo").item(0).getTextContent();
                    System.out.println("Título: " + titulo);
                }
            }

            // Passo 3: Modificar o ano de um dos livros
            Element livro = (Element) nList.item(0); // Modifica o primeiro livro
            livro.getElementsByTagName("ano").item(0).setTextContent("2022");

            // Passo 4: Salvar as alterações de volta no arquivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/teste/exemplo.xml"));
            transformer.transform(source, result);

            System.out.println("Ano do primeiro livro atualizado para 2022.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/
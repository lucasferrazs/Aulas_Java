package testandoXsd;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import javax.xml.XMLConstants;
import org.xml.sax.SAXException;

public class ManipularXML {
    public static void main(String[] args) {
        try {
            // Carregar o arquivo XML
            File xmlFile = new File("src/testandoXsd/livros.xml");
            File xsdFile = new File("src/testandoXsd/livros.xsd");

            // Criar um DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            // Criar um DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            // Validar o documento XML contra o XSD
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(xsdFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));
            System.out.println("O XML é válido!");

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
            StreamResult result = new StreamResult(new File("src/testandoXsd/livros_atualizados.xml")); // Salva o arquivo atualizado
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Formatar a saída
            transformer.transform(source, result);

            System.out.println("Novo livro adicionado e arquivo salvo como 'livros_atualizados.xml'.");
            
        } catch (SAXException e) {
            System.out.println("O XML não é válido: " + e.getMessage());
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
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import javax.xml.XMLConstants;
import org.xml.sax.SAXException;

public class ManipularXML {
    public static void main(String[] args) {
        try {
            // Carregar o arquivo XML e XSD
            File xmlFile = new File("src/livros.xml");
            File xsdFile = new File("src/livros.xsd");

            // Criar um DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);

            // Criar um DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);

            // Validar o documento XML contra o XSD
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(xsdFile);
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xmlFile));
            System.out.println("O XML é válido!");

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
            StreamResult result = new StreamResult(new File("src/livros_atualizados.xml")); // Salva o arquivo atualizado
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Formatar a saída
            transformer.transform(source, result);

            System.out.println("Novo livro adicionado e arquivo salvo como 'livros_atualizados.xml'.");

        } catch (SAXException e) {
            System.out.println("O XML não é válido: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 
  
 */

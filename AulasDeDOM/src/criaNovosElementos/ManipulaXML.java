package criaNovosElementos;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;
public class ManipulaXML {
    public static void main(String[] args) {
        try {
        	 Scanner sc = new Scanner(System.in);
            // Passo 1: Ler o arquivo XML
            File arquivoXML = new File("src/criaNovosElementos/exemplo.xml");
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
                    String autor = elemento.getElementsByTagName("autor").item(0).getTextContent();
                    String ano = elemento.getElementsByTagName("ano").item(0).getTextContent();
                    System.out.println("\nTítulo: " + titulo + "\nAutor: " + autor + "\nAno de lançamento: " + ano);
                    
                }
            }
            

            // Passo 3: Criar um novo livro
            Element novoLivro = doc.createElement("livro");

            Element novoTitulo = doc.createElement("titulo");
            System.out.println("digite o titulo do livro :");
            String nodeTitulo = sc.nextLine() ;
            novoTitulo.appendChild(doc.createTextNode(nodeTitulo));
            novoLivro.appendChild(novoTitulo);

            Element novoAutor = doc.createElement("autor");
            System.out.println("digite o nome do autor :");
            String nodeAutor = sc.nextLine();
            novoAutor.appendChild(doc.createTextNode(nodeAutor));
            novoLivro.appendChild(novoAutor);

            Element novoAno = doc.createElement("ano");
            System.out.println("digite o ano de lançamento do livro : ");
            String nodeAno = sc.nextLine();
            novoAno.appendChild(doc.createTextNode(nodeAno));
            novoLivro.appendChild(novoAno);

            // Adicionar o novo livro ao elemento raiz
            doc.getDocumentElement().appendChild(novoLivro);

            // Passo 4: Salvar as alterações de volta no arquivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/criaNovosElementos/exemplo.xml"));
            transformer.transform(source, result);

            System.out.println("Novo livro adicionado: " + nodeTitulo  + ", " + nodeAutor + ", " + nodeAno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
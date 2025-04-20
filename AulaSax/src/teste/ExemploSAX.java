package teste;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ExemploSAX {
    public static void main(String[] args) {
        try {
            // Criar uma fábrica de parser SAX
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // Criar uma instância do manipulador
            MeuManipuladorSAX manipulador = new MeuManipuladorSAX();

            // Analisar o arquivo XML
            saxParser.parse("src/teste/exemplo.xml", manipulador);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
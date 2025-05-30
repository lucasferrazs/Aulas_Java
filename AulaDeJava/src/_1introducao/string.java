package _1introducao;

public class string {
    public static void main(String[] args) {
    //Criação de string
    //Você pode criar uma string em Java de duas maneiras.
    String s1 = "Hello World"; // Criando uma string 
    //usando uma literal de string
    
    String s2 = new String("Hello World"); // Criando uma string 
    //usando a palavra-chave 'new'
    
    //Concatenação de Strings:
    //Você pode usar o operador + para concatenar (unir) duas strings.
    String s3 = "Hello ";
    String s4 = "World";
    String s5 = s3 + s4; // s3 é agora "Hello World"

    
    //Comparação de Strings:
    //Você pode usar o método .equals() para comparar duas strings por valor.
    
    String s6 = "Hello";
    String s7 = "Hello";
    boolean isEqual = s6.equals(s7); // isEqual é verdadeiro
    
    //Você também pode usar o método .equalsIgnoreCase() para comparar duas 
    //strings por valor, 
    //ignorando a diferença entre maiúsculas e minúsculas.
    String s8 = "Hello";
    String s9 = "HELLO";
    boolean isignoreEqual = s8.equalsIgnoreCase(s9); // isEqual é verdadeiro
   
    //Tamanho de uma string
    //Você pode usar o método .length() para obter o número de caracteres em uma 
    //string.
    String s = "Hello World";
    int len = s.length(); // len é 11
    
    //Você pode usar o método .substring() para obter uma parte da string.
    String ss = "Hello World";
    String sub = ss.substring(0, 5); // sub é "Hello"
    
    //Você pode usar o método .toUpperCase() para converter uma string para maiúsculas, e 
    //.toLowerCase() para convertê-la para minúsculas.
    String s10 = "Hello World";
    String upper = s10.toUpperCase(); // upper é "HELLO WORLD"
    String lower = s10.toLowerCase(); // lower é "hello world"
    
    // Remoção de espaços em branco:
    String s11 = "   Hello World   ";
    String trimmed = s11.trim(); // trimmed é "Hello World"

    
    }
}

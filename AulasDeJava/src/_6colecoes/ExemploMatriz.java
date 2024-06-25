package _6colecoes;

public class ExemploMatriz {
    public static void main(String[] args) {
        // Declarando e criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Inicializando a matriz com valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Exibindo a matriz
        // O primeiro loop (for (int i = 0; i < matriz.length; i++)) itera pelas linhas da matriz.
        // O segundo loop (for (int j = 0; j < matriz[i].length; j++)) itera pelas colunas da matriz.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                //O valor de cada elemento é acessado usando matriz[i][j].
            }
            System.out.println();
        }
        
        
     String[][] matrizS = new String[2][2];
     matrizS[0][0] = "um";
     matrizS[0][1] = "dois";
     matrizS[1][0]=  "tres";
     matrizS[1][1] = "quatro";
        
     
     for (int i = 0; i < matrizS.length; i++) {
         for (int j = 0; j < matrizS[i].length; j++) {
             System.out.print(matrizS[i][j] + " ");
         }
         System.out.println();
     }
    }
}
 





/*

Preenchendo e Exibindo uma Matriz Quadrada:
Crie um programa que declare e construa uma matriz quadrada de tamanho 4x4 
(ou seja, com 4 linhas e 4 colunas).
Preencha essa matriz com números inteiros positivos.
Em seguida, exiba os valores na tela no formato de uma matriz.


Contagem de Números Pares e Ímpares:
Declare e construa uma matriz 3x5 de inteiros.
Preencha a matriz com valores de sua escolha.
Informe:
Se a matriz possui elementos repetidos.
A quantidade de números pares.
A quantidade de números ímpares.


Manipulação de Diagonais em uma Matriz Decimal:	
Declare e construa uma matriz 4x4 de números decimais (pode ser do tipo double).
Preencha a matriz com valores de sua escolha.
Exiba:
Os valores da diagonal principal (elementos com o mesmo índice de linha e coluna).
Os valores da diagonal secundária (elementos com índices que somam 3). 


  */
 
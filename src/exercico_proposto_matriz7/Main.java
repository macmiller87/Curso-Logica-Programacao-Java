/**
 * @author Macmiller
 */

/*
O sargento Silva organiza seu pelotão em M filas numeradas a partir de 1, sendo cada fila com a mesma quantidade de 
soldados. Por exemplo, a figura abaixo mostra a organização do pelotão em 3 filas com 8 soldados em cada uma.
Um dos exercícios que o sargento Silva realiza com o pelotão é o exercício "girar fila", que consiste em dizer o número 
de uma fila, de modo que os soldados desta fila devem se mover para a direita, e o último soldado da direita vai para a 
posição mais à esquerda. Você deve fazer um programa para ler a formação do pelotão e executar o exercício "girar fila".
Entrada:

A entrada consiste em um inteiro M representando o número de filas, um inteiro N representado a quantidade de soldados 
por fila, as M filas de soldados (cada soldado é representado por um número inteiro), e o número inteiro para o exercício 
"girar fila".

Saída:
A saída contém a formação do pelotão após a execução do exercício "girar fila".

Exemplo Entrada:

3
5
1034 2271 9013 9281 1138
2837 1827 1074 9271 7201
1822 1977 1821 2278 1821
2

Exemplo Saída:
1034 2271 9013 9281 1138
7201 2837 1827 1074 9271
1822 1977 1821 2278 182
*/

package exercico_proposto_matriz7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        
        int[][] numbers = new int[linha][coluna];
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int fila = sc.nextInt();
        
        // como nossa matriz comeca na linha 0, vamos decrementar o valor da fila;
        fila += -1;
        
        // passo 1: vamos salvar o ultimo da fila escolhida.
        int ultimoDaFila = numbers[fila][coluna - 1];
        
        // passo 2: vamos mover todos da fila (menos o ultimo) para a direita,
	// mas teremos que fazer isso da direita para a esquerda (contagem decrescente)
        for(int i = coluna -1; i > 0; i--) {
            numbers[fila][i] = numbers[fila][i - 1];
        }
        
        // passo 3: agora vamos armazenar o ultimo na primeira posicao da fila
        numbers[fila][0] = ultimoDaFila;
        
        // Imprimir a matriz alterada.
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

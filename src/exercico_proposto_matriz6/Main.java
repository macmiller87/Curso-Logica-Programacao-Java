/**
 * @author Macmiller
 */

/*
Armazena numeros em 1 matrizes de (N linhas por N colunas), após:

a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir a matriz alterada
*/

package exercico_proposto_matriz6;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double[][] numbers = new double[num][num];
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                numbers[i][j] = sc.nextDouble();
            }
        }
        
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        
        // Pega e soma os numeros positivos e imprime.
        double somaNumbers = 0.0;
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                
                if(numbers[i][j] > 0.0) {
                    somaNumbers += numbers[i][j];
                }
            }
        }
        
        System.out.printf("SOMA DOS POSITIVOS: %.1f \n", somaNumbers);
        
        // Pega a linha escolhida e imprime..
        System.out.print("LINHA ESCOLHIDA: ");
        for(int i = 0; i < num; i++) {
           System.out.printf("%.1f ", numbers[linha][i]);
        }
        System.out.println();
        
        // Pega a coluna escolhida e imprime.
        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i = 0; i < num; i++) {
           System.out.printf("%.1f ", numbers[i][coluna]);
        }
        System.out.println();
        
        // Pega a diagonal principal e imprime.
        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i = 0; i < num; i++) {
           System.out.printf("%.1f ", numbers[i][i]);
        }
        System.out.println();
        
        // Altera os numeros negativos e eleva ao quadrado da matriz e imprime.
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                if(numbers[i][j] < 0.0) {
                    numbers[i][j] = numbers[i][j] * numbers[i][j];
                }
            }
        }
        
        // Imprime a matriz após a alteração acima.
        System.out.println("MATRIZ ALTERADA: ");
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.printf("%.1f ", numbers[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}

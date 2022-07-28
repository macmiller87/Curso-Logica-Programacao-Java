/**
 * @author Macmiller
 */

// Armazena numeros em 2 matrizes de (N linhas por N colunas), após é gerarda uma 3 matriz que armazena a soma entre os elementos das matrizes anteriores, e os apresenta.

package exercico_proposto_matriz5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        
        int[][] numbers1 = new int[linha][coluna];
        int[][] numbers2 = new int[linha][coluna];
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                numbers1[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                numbers2[i][j] = sc.nextInt();
            }
        }
        
        int[][] somaNumbers1e2 = new int[linha][coluna];
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                somaNumbers1e2[i][j] = numbers1[i][j] + numbers2[i][j];
                System.out.print(somaNumbers1e2[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}

/**
 * @author Macmiller
 */

// Armazena numeros em uma matriz de (N linhas por N colunas), após faz a soma dos numeros acima da diagonal principal da matriz, e os apresenta.

package exercico_proposto_matriz4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[][] numbers = new int[num][num];
        
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int somaAcimadiagonalPrincipal = 0;
        
        for(int i = 0; i < num; i++) {
            for(int j = i + 1; j < num; j++) {
               somaAcimadiagonalPrincipal += numbers[i][j];
            }
        }
        
        System.out.println(somaAcimadiagonalPrincipal);
        
        sc.close();
    }
}
 
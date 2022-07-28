/**
 * @author Macmiller
 */

// Armazena numeros em uma matriz de (N linhas por N colunas), após faz a soma entre os indices de cada linha e coluna da matriz e os apresenta.

package exercico_proposto_matriz2;
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
        
        for(int i = 0; i < num; i++) {
            int somaLinhaColuna = 0;
            
            for(int j = 0; j < num; j++) {
                somaLinhaColuna += numbers[i][j];
                
            }
            System.out.println(somaLinhaColuna);
        }
        
        sc.close();
    }
}

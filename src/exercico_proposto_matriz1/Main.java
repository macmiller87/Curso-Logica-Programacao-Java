/**
 * @author Macmiller
 */

// Armazena numeros em uma matriz de (N linhas por N colunas), após verifica quais numeros armazenados na matriz, são negativos e os apresenta.

package exercico_proposto_matriz1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        
        int[][] numbers = new int[linha][coluna];
        
        for(int i = 0; i < linha; i ++) {
            for(int j = 0; j < coluna; j ++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int numNegativos = 0;
        
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                
                if(numbers[i][j] < 0) {
                    numNegativos = numbers[i][j];
                    System.out.println("VALORES NEGATIVOS: " + numNegativos);
                }
            }
        }
        
        sc.close();
    }
}

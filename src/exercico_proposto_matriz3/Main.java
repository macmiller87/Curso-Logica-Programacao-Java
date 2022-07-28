/**
 * @author Macmiller
 */

// Armazena numeros em uma matriz de (N linhas por N colunas), após verifica qual é o maior numero de cada linha da matriz.

package exercico_proposto_matriz3;
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
            int maiorNumeroLinha = numbers[i][0];
            
            for(int j = 0; j < num; j++) {
                if(numbers[i][j] > maiorNumeroLinha) {
                    maiorNumeroLinha = numbers[i][j];
                }
            }
            System.out.println(maiorNumeroLinha);
        }
        
        sc.close();
    }
}

/**
 * @author Macmiller
 */

// Armazena N quantidades de numeros em dois vetores diferentes, e faz a soma entre cada elemento desses dois vetores. 
//, em seguida armazena a soma de cada elemento em um outro vetor para ser apresentado.

package exercicio_proposto_vetores3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[] numbers = new int[num];
        int[] numbers2 = new int[num];
        int[] numbersSomaVet1e2 = new int[num];
        
        for(int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for(int j = 0; j < num; j++) {
            numbers2[j] = sc.nextInt();
        }
        
        int totalSomaVetores = 0;
        
        for(int k = 0; k < num; k++) {
            numbersSomaVet1e2[k] = numbers[k] + numbers2[k];
            totalSomaVetores = numbersSomaVet1e2[k];
            System.out.print(totalSomaVetores + " ");
        }
    
        sc.close();
    }
}

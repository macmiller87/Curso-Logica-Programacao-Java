/**
 * @author Macmiller
 */

// Extrai os números Pares de um vetor e conta quantos números foram pares.

package exercicio_proposto_vetores2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[] numbers = new int[num];
        
        for(int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int numPares = 0;
        int count = 0;
        
        for(int j = 0; j < numbers.length; j++) {
            
            if(numbers[j] % 2 == 0) {
                numPares = numbers[j];
                count++;
                System.out.print(numPares + " ");
            }
        }
        
        System.out.println(count);
        sc.close();
        
    }
}

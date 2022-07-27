/**
 * @author Macmiller
 */

// Encontra o maior numero dentro de um array e qual foi sua posição de entrada.

package exercicio_proposto_vetores1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int nums = sc.nextInt();
        
        double[] numbers = new double[nums];
        
        for(int i = 0; i < nums; i++) {
            numbers[i] = sc.nextDouble();
        }
        
        int count = 0;
        double maiorNum = 0;
        
        for(int j = 0; j < numbers.length; j++) {
            
            if(numbers[j] > maiorNum) {
                maiorNum = numbers[j];
                count = j;
            }
        }
        
        System.out.println(maiorNum);
        System.out.println(count);
        
        sc.close();
    }
}

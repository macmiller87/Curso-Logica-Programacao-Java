/**
 * @author Macmiller
 */

// Armazena N quantidades de numeros em um vetor, em seguida soma todos os numeros no vetor, após calcula a media dos numeros armazenados 
// no vetor através de cada elemento, finaliza pegando os números que ficaram abaixo da média.

package exercicio_proposto_vetores4;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double[] numbers = new double[num];
        
        for(int i = 0; i < num; i ++) {
            numbers[i] = sc.nextDouble();
        }
        
        double totalNumbers = 0;
        double mediaNumbersVet = 0;
        
        for(int j = 0; j < num; j ++) {
            totalNumbers += numbers[j];
            mediaNumbersVet = totalNumbers / num;
        }
        
        System.out.printf("%.3f \n", mediaNumbersVet);
        
        double numbersBelowMedia = 0;
        
        for(int k = 0; k < numbers.length; k++) {
            
            if(numbers[k] < mediaNumbersVet) {
                numbersBelowMedia = numbers[k];
                System.out.printf("%.1f \n", numbersBelowMedia);
            }
        }
        
        sc.close();
    }
}

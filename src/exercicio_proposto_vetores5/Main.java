/**
 * @author Macmiller
 */

// Armazena N quantidades de numeros em um vetor, em seguida armazena e soma em variaveis, todos os numeros pares do vetor,
// e finaliza apresentado a média entre os números pares encontardos.

package exercicio_proposto_vetores5;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int[] numbers = new int[num];
        
        for(int i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int numPares = 0;
        int somaPares = 0;
        int countPares = 0;
        double mediaNumPares = 0;
        
        for(int j = 0; j < numbers.length; j++) {
        
            if(numbers[j] % 2 == 0) {
                numPares = numbers[j];
                somaPares += numbers[j];
                countPares++;
                mediaNumPares = somaPares / countPares;
                
                System.out.println("Numeros Pares encontrados: " + numPares);
            }
        }
        
        System.out.println("Media entre numeros Pares encontrados: " + mediaNumPares);
        
        sc.close();
    }
}

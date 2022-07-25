/**
 * @author Macmiller
 */
package beecrowd1154;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        
        int countIdade = 0;
        int quantIdadeDivisao = 0;
        
        double media;
        
        if(idade > 0) {
            countIdade = idade;
            quantIdadeDivisao++;
        }
        
        while(idade > 0) {
        
            idade = sc.nextInt();
            
            if(idade > 0) {
                countIdade += idade;
                quantIdadeDivisao++;
            }
        }
        
        media = (double) countIdade / quantIdadeDivisao;
        System.out.printf("%.2f\n", media);
        
        sc.close();
    }
}

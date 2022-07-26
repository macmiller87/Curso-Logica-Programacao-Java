/**
 * @author Macmiller
 */
package beecrowd1079;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
          
        int num = sc.nextInt();
        
        int peso2 = 2;
        int peso3 = 3;
        int peso5 = 5;
        
        double mediaPonderada = 0;
        
        for(int i= 0; i< num; i++) {
            
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
            
            mediaPonderada = ((num1 * peso2) + (num2 * peso3) + (num3 * peso5)) / 10;
            System.out.printf("%.1f\n", mediaPonderada);
        }
        
        sc.close();
    }
}

/**
 * @author Macmiller
 */
package beecrowd1002;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double B = sc.nextDouble();
        double R = Math.pow(B, 2.0);
        double N = 3.14159;

        double A = N * R; 
        
        System.out.printf("A=%.4f\n", A);
         
        sc.close(); 
    }      
}

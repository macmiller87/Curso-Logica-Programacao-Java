/**
 * @author Macmiller
 */
package beecrowd1014;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int distanPercorrida = sc.nextInt();
        double totalCombustivel = sc.nextDouble();
        
        double media = distanPercorrida / totalCombustivel;
        
        System.out.printf("%.3f km/l\n", media);
        sc.close();
    }
}

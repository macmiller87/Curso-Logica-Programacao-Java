/**
 * @author Macmiller
 */
package beecrowd1011;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextDouble();
        double raioCubo = Math.pow(raio, 3.0);
        double pi =  3.14159;
        
        double formEsfera = (4 / 3.0) * pi * raioCubo;
        
        System.out.printf("VOLUME = %.3f\n", formEsfera);
        sc.close();
    }
}

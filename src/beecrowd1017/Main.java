/**
 * @author Macmiller
 */
package beecrowd1017;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int tempoTotal = sc.nextInt();
        int velocMedia = sc.nextInt();
        
        double totaLitros = (tempoTotal * velocMedia) / 12.0;
        
        System.out.printf("%.3f\n", totaLitros);
        sc.close();
    }
}

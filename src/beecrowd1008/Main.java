/**
 * @author Macmiller
 */
package beecrowd1008;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int numFunc = sc.nextInt();
        int horasTrab = sc.nextInt();
        
        double quantHoras = sc.nextDouble();
        double salario = (quantHoras * horasTrab);
        
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SÁLARY = U$ %.2f\n", salario);
        sc.close();
    }
}

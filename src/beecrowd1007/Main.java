/**
 * @author Macmiller
 */
package beecrowd1007;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int diferenca = (A * B - C * D);
        
        System.out.println("DIFERENCA = " + diferenca);
        sc.close();
    }
}

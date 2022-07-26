/**
 * @author Macmiller
 */
package beecrowd1078;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numTabuada = sc.nextInt();
        
        for(int i = 1; i <= 10; i++) {
        
            System.out.println(i + " x " + numTabuada + " = " + i * numTabuada);
        }
        
        sc.close();
    }
}

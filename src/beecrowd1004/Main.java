/**
 * @author Macmiller
 */
package beecrowd1004;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int PROD = num1 * num2;
        
        System.out.println("PROD = " + PROD);
    }
}

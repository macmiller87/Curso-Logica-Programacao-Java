/**
 * @author Macmiller
 */
package beecrowd1113;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        while(num1 != num2) {
        
            if(num1 < num2) {
                System.out.println("Crescente");
                
            }else {
                System.out.println("Decrescente");
            }
            
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            
        }
        sc.close();
    }
}

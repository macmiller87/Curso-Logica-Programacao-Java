/**
 * @author Macmiller
 */
package beecrowd1074;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int x;
        
        for(int i = 0; i < num; i++) {
            
            x = sc.nextInt();
            
            if(x == 0) {
                System.out.println("NULL");
                
            }else if(x > 0 && x % 2 == 0) {
                System.out.println("EVEN POSITIVE");
                
            }else if(x < 0 && x % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
                
            }else if(x > 0 && x % 2 != 0) {
                System.out.println("ODD POSITIVE");
                
            }else {
                System.out.println("ODD NEGATIVE");
            }
        }
        
        sc.close();
    }
}

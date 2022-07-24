/**
 * @author Macmiller
 */
package beecrowd1115;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int aux = 0;
        
        while(X != aux && Y != aux) {
        
            if(X > 0 && Y > 0) {
                System.out.println("primeiro");
                
            }else if(X < 0 && Y > 0) {
                System.out.println("segundo");
                
            }else if(X < 0 && Y < 0) {
                System.out.println("terceiro");
                
            }else {
                System.out.println("quarto");
            }
            
            X = sc.nextInt();
            Y = sc.nextInt();
        }
        
        sc.close();
    }
}

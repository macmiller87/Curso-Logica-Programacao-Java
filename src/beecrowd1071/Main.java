/**
 * @author Macmiller
 */
package beecrowd1071;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
            
        int soma = 0;
        
        if(X > Y) {
        
            for (int i = Y + 1; i < X; i++) {

                if (i % 2 != 0) {

                    soma += i;
                }
            }
             
        }else {
        
            for (int i = X + 1; i < Y; i++) {

                if (i % 2 != 0) {

                    soma += i; 
                }
            }
        }
        
        System.out.println(soma);
        
        sc.close();
    }
}

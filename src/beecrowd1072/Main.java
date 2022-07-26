/**
 * @author Macmiller
 */
package beecrowd1072;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int x;
        
        int in = 0;
        int out = 0;
        
        for(int i = 0; i < num; i++) {
            
            x = sc.nextInt();
            
            if(x >= 10 && x <= 20) {
                in++;
                
            }else {
                out++;
            }
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }
}

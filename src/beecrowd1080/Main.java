/**
 * @author Mcmiller
 */
package beecrowd1080;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int x;
        int posicao = 0;
        
        for(int i = 2; i <= 100; i++) {
        
            x = sc.nextInt();
            
            if(x > num) {
                num = x;
                posicao = i;
            }
        }
        
        System.out.println(num);
        System.out.println(posicao);
        
        sc.close();
    }
}

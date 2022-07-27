/**
 * @author Macmiller
 */
package beecrowd1143;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int prim = 0;
        int seg = 0;
        int terc = 0;
        
        for(int i = 1; i <= num; i++) {
        
            prim = i;
            seg = i * i;
            terc = i * i * i;
            System.out.printf("%d %d %d\n", prim, seg, terc);
            
            prim += 2;
        }
        
        sc.close();
    }
}

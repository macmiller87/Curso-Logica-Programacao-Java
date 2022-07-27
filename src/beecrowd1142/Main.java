/**
 * @author Macmiller
 */
package beecrowd1142;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int prim = 1;
        int seg = 0;
        int terc = 0;
        
        for(int i = 1; i <= num; i++) {
        
            seg = prim + 1;
            terc = prim + 2;
            System.out.printf("%d %d %d PUM\n", prim, seg, terc);
            
            prim += 4;
        }
        
        sc.close();
    }
}

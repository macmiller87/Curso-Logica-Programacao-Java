/**
 * @author Macmiller
 */
package beecrowd1159;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int cincoNumParesAPartirDeX = 0;
        int cincoNumParesAPartirDeXSeComecarImpar = 0;
        
        while(x != 0) {
            
            if(x % 2 == 0) {
                cincoNumParesAPartirDeX = x * 5 + 20;
                System.out.println(cincoNumParesAPartirDeX);
                
            }else {
                cincoNumParesAPartirDeXSeComecarImpar = (x + 1) * 5 + 20;
                 System.out.println(cincoNumParesAPartirDeXSeComecarImpar);
            }
            
            x = sc.nextInt();
        }
        
        sc.close();
    }
}

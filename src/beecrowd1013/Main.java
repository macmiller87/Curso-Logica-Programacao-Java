/**
 * @author Macmiller
 */
package beecrowd1013;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        /*
        if(A > B && A > C) {
            int maiorA = A;
            System.out.println(maiorA + " eh o maior");
            
        }else if(B > A && B > C) {
            int maiorB = B;
            System.out.println(maiorB + " eh o maior");
            
        }else {
            int maiorC = C;
            System.out.println(maiorC + " eh o maior");
        }
        */
        
        int k = (A + B + Math.abs(A - B)) / 2;

	int t = (k + C + Math.abs(k - C)) / 2;
        
        System.out.println(t + " eh o maior");
        
        sc.close();
    }
}

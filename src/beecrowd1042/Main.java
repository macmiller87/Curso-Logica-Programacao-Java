/**
 * @author Macmiller
 */
package beecrowd1042;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0 ) {
            System.out.println("Sao Multiplos");

        }else {
            System.out.println("Nao sao Multiplos");
        }
        
        sc.close();
    }
}

/**
 * @author Macmiller
 */
package beecrowd1016;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int carro = sc.nextInt();
        
        int diferenca = carro * 2;
        
        System.out.println(diferenca + " minutos");
        sc.close();
    }
}

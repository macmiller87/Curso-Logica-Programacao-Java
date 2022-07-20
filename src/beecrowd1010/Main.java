/**
 * @author Macmiller
 */
package beecrowd1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codProd1 = sc.nextInt();
        int quantProd1 = sc.nextInt();
        double preco1 = sc.nextDouble();
        
        int codProd2 = sc.nextInt();
        int quantProd2 = sc.nextInt();
        double preco2 = sc.nextDouble();
        
        double resulProd1 =  quantProd1 * preco1;
        double resulProd2 =  quantProd2 * preco2;
        
        double totalProd = resulProd1 + resulProd2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalProd);
        sc.close();
    }
}

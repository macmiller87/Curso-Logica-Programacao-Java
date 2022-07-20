/**
 * @author Macmiller
 */
package beecrowd1009;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome = sc.next();
        
        double salarioFix = sc.nextDouble();
        double totalVendas = sc.nextDouble();
        
        double bonusFunc = totalVendas * 0.15;
        double salarioFunc = salarioFix + bonusFunc;
        
        // System.out.println(nome);
        // System.out.printf("Salario fixo = R$ %.2f%n", salarioFix);
        // System.out.printf("Total vendas = R$ %.2f%n", totalVendas);
        // System.out.printf("Bonus Funcioario = R$ %.2f%n", bonusFunc);
        System.out.printf("TOTAL = R$ %.2f\n", salarioFunc);
        sc.close();
    }
}

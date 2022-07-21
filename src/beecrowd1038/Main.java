/**
 * @author Macmiller
 */
package beecrowd1038;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double cachorroQuente, xSalada, xBacon, torradaSimples, refri,
                total1, total2, total3, total4, total5;
        
        int codProd = sc.nextInt();
        int quantProd = sc.nextInt();
        
        switch (codProd) {
            case 1:
                cachorroQuente = 4.00;
                total1 = quantProd * cachorroQuente;
                System.out.printf("Total: R$ %.2f\n", total1);
                break;
            case 2:
                xSalada = 4.50;
                total2 = quantProd * xSalada;
                System.out.printf("Total: R$ %.2f\n", total2);
                break;
            case 3:
                xBacon = 5.00;
                total3 = quantProd * xBacon;
                System.out.printf("Total: R$ %.2f\n", total3);
                break;
            case 4:
                torradaSimples = 2.00;
                total4 = quantProd * torradaSimples;
                System.out.printf("Total: R$ %.2f\n", total4);
                break;
            case 5:
                refri = 1.50;
                total5 = quantProd * refri;
                System.out.printf("Total: R$ %.2f\n", total5);
                break;
            default:
                System.out.println("Opçaõ selecionada não existe");
                break;
        }
        
        sc.close();
    }
}

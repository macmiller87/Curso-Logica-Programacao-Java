/**
 * @author Macmiller
 */

// Armazena N quantidades de mercadorias em um vetor, Armazena o valor de (compra e venda) das respectivas mercadorias em outros 2 vetotres
// após e verificado qual e a quantidade de mercadoria deu lucro (abaixo de 10%, entre 10% e 20% e acima de 20%), 
// em seguida informa o valor de compra total, o valor de venda total, e por fim o (lucro total alcançado).

package exercicio_proposto_vetores9;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String[] mercadorias = new String[num];
        double[] precoCompra = new double[num];
        double[] precoVenda = new double[num];
        
        for(int i = 0; i < num; i++) {
            mercadorias[i] = sc.next();
            precoCompra[i] = sc.nextDouble();
            precoVenda[i] = sc.nextDouble();
        }
        
        double precoProdutoReal = 0;
        double porcentLucro = 0;
        
        int countLucroAbaixo10 = 0;
        int countLucroAcima20 = 0;
        int countLucroEntre10e20 = 0;
        
        for(int j = 0; j < num; j++) {
            precoProdutoReal = precoVenda[j] - precoCompra[j];
            porcentLucro = precoProdutoReal / precoCompra[j] * 100.0;
            
            if(porcentLucro < 10.0) {
                countLucroAbaixo10++;
                
            }else if(porcentLucro <= 20.0) {
                countLucroEntre10e20++;
                
            }else {
                countLucroAcima20++;
            }
        }
        
        double totalPrecoCompra = 0;
        double totalPrecoVenda = 0;
        double lucroTotal = 0;
        
        for(int k = 0; k < num; k++) {
            totalPrecoCompra += precoCompra[k];
            totalPrecoVenda += precoVenda[k];
            lucroTotal = totalPrecoVenda - totalPrecoCompra;
        }
        
        System.out.println("Lucro abaixo de 10%: " + countLucroAbaixo10);
	System.out.println("Lucro entre 10% e 20%: " + countLucroEntre10e20);
	System.out.println("Lucro acima de 20%: " + countLucroAcima20);
        System.out.printf("Valor total de compra: %.2f \n", totalPrecoCompra);
        System.out.printf("Valor total de venda: %.2f \n", totalPrecoVenda);
        System.out.printf("Lucro total: %.2f \n", lucroTotal);
        
        sc.close();
        
    }
}

 
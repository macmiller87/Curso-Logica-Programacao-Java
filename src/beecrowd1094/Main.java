/**
 * @author Macmiller
 */
package beecrowd1094;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int x;
        int count = 0;
        
        int rato = 0;
        int sapo = 0;
        int coelho = 0;
        
        char letra;
        
        double percentRato = 0;
        double percentSapo = 0;
        double percentCoelho = 0;
        double total;
        
        for(int i = 0; i < num; i ++) {
        
            x = sc.nextInt();
            count += x;
            letra = sc.next().charAt(0);
            
            switch(letra) {
            
                case 'R':
                    rato += x;
                    break;
                case 'S':
                    sapo += x;
                    break;
                case 'C':
                    coelho += x;
                    break;    
            }
            
        }
        
        total = (rato + sapo + coelho);
        percentRato += (double) rato / total * 100.0;
        percentSapo += (double) sapo / total * 100.0;
        percentCoelho += (double) coelho / total * 100.0;
        
        System.out.println("Total: " + count + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentCoelho);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentRato);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentSapo); 
        
        
        sc.close();
    }
}

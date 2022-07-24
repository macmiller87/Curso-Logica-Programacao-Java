/**
 * @author Macmiller
 */
package beecrowd1118;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        
        double media;
        int x;
        int aux = 0;
        
        while(aux != 2) {
            
            while (nota1 < 0 || nota1 > 10) {

                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }
            
            while (nota2 < 0 || nota2 > 10) {

                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }

            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            x = sc.nextInt();
            
            while(x != 1 && x != 2) {
                
                System.out.println("novo calculo (1-sim 2-nao)");
                x = sc.nextInt();
                aux = x;
                
                if(aux == 1) {
                    
                    nota1 = sc.nextDouble();
                    nota2 = sc.nextDouble();
                    media = 0;
                    aux = 0;
                }
            }
            
            if(x != 1) {
                aux = x;
            }
        }
        
        sc.close();
    }
}

/**
 * @author Macmiller
 */
package beecrowd1131;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int golInter = sc.nextInt();
        int golGremio = sc.nextInt();
        
        int novaPartida = 1;
        
        int countVitoriasInter = 0;
        int countVitoriasGremio = 0;
        int empate = 0;
        int countPartidas = 1;
        
          
        while(novaPartida == 1) {
            System.out.println("Novo grenal (1-sim 2-nao)");

            if (golInter == golGremio) {
                empate++;

            } else if (golInter > golGremio) {
                countVitoriasInter++;

            } else {
                countVitoriasGremio++;
            }
            
            novaPartida = 0;
            novaPartida = sc.nextInt();
            
            if (novaPartida == 1) {
                golInter = sc.nextInt();
                golGremio = sc.nextInt();
                countPartidas += 1;
            }
            
        }
        
        if(novaPartida == 2) {
        
            System.out.println(countPartidas + " grenais");
            System.out.println("Inter:" + countVitoriasInter);
            System.out.println("Gremio:" + countVitoriasGremio);
            System.out.println("Empates:" + empate);

            if (countVitoriasInter > countVitoriasGremio) {
                System.out.println("Inter venceu mais");

            } else {
                System.out.println("Gremio venceu mais");
            }
        }
        
        sc.close();
    }
}

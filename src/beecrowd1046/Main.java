/**
 * @author Macmiller
 */
package beecrowd1046;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        
        int duracaoJogo;
        
        if(horaInicio < horaFim){
            duracaoJogo = horaFim - horaInicio;
            System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
            
        }else {
            duracaoJogo = (24 - horaInicio) + horaFim;;
             System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
        }
        
        sc.close();
    }
}

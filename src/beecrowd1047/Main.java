/**
 * @author Macmiller
 */
package beecrowd1047;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();
        
        int horaEminutoInicial = horaInicial * 60 + minutoInicial;
        int horaEminutoFinal = horaFinal * 60 + minutoFinal;
        int duracao;
        
        if(horaEminutoInicial < horaEminutoFinal) {
            duracao = horaEminutoFinal - horaEminutoInicial;
            
        }else {
            duracao = (24 * 60 - horaEminutoInicial) + horaEminutoFinal;
        }
        
        int totalHoras = duracao / 60;
        int totalMinutos = duracao % 60;
        
        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S) E " + totalMinutos + " MINUTO(S)");
        sc.close();
        
    }
}

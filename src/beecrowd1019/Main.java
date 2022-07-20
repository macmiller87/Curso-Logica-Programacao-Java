/**
 * @author Macmiller
 */
package beecrowd1019;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int horas = N / 3600;
        int resto = N % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;        
      
        System.out.println(horas + ":" + minutos + ":" + segundos);
        sc.close();
    }
}

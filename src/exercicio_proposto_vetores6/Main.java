/**
 * @author Macmiller
 */

// Armazena N quantidades de nomes em um vetor, em seguida armazena N quantidades de idades em um outro vetor, fazendo assim 2 vetores com
// nomes e idades respectivas em posições entre os vetores, em seguida encontra o nome da pessoa mais velha através do indice do vetor de idades.

package exercicio_proposto_vetores6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String[] nomes = new String[num];
        int[] idades = new int[num];
        
        for(int i = 0; i < num; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
        }
        
        int maiorIdade = 0;
        int countIndiceIdade = 0;
        
        for(int j = 0; j < idades.length; j++) {
            
            if(idades[j] > maiorIdade) {
                maiorIdade = idades[j];
                countIndiceIdade = j;
            }
        }
        
        System.out.println(nomes[countIndiceIdade] + " " + maiorIdade);
        sc.close();
    }
}

/**
 * @author Macmiller
 */

// Armazena N quantidades de altura em um vetor, armazena os caracteres 'F' ou 'M' em outro vetor, 
// após verifica a menor e maior altura encontrada, a quatidade de mulheres, representadas com o caracteres 'F', 
// após calcula a média das alturas das mulheres encontradas, e a quantidade de homens encontrados representadas com o caracteres 'M'.

package exercicio_proposto_vetores8;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        double[] altura = new double[num];
        char[] sexo = new char[num];
        
        for(int i = 0; i < num; i++) {
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }
        
        double maiorAltura = 0;
        double menorAltura = altura[0];
        
        for(int j = 0; j < num; j++) {
        
            if(altura[j] > maiorAltura) {
                maiorAltura = altura[j];
            }
            
            if(altura[j] < menorAltura) {
                menorAltura = altura[j];
            }
        }
        
        System.out.println("Menor altura encontrada: " + menorAltura);
        System.out.println("Maior altura encontrada: " + maiorAltura);
        
        int countMulheres = 0;
        int countM = 0;
        int countH = 0;
        
        double totalAlturaMulheres = 0;
        double mediaAlturaMulheres = 0;
        
        for(int k = 0; k < num; k ++) {
        
            if(sexo[k] == 'F') {
                countMulheres = k;
                countM++;

                totalAlturaMulheres += altura[countMulheres];
                mediaAlturaMulheres = totalAlturaMulheres / countM;
   
            }else {
                countH++;
            }
        }
        
        System.out.printf("Media das alturas das mulheres encontradas = %.2f \n", mediaAlturaMulheres);
        System.out.println("Numero de Homens encontrados = " + countH);
        
        sc.close();
    }
}

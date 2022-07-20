/**
 * @author Macmiller
 */
package beecrowd1040;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        
        float peso1 = nota1 * 2;
        float peso2 = nota2 * 3;
        float peso3 = nota3 * 4;
        float peso4 = nota4 * 1;
        
        float media = (peso1 + peso2 + peso3 + peso4) / 10;
        
        if(media >= 7.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
            
        }else if(media < 5.0) {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
            
        }else { 
            
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            float exame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", exame);
            float mediaFinal = (media + exame) / 2;
            
            if(mediaFinal >= 5.0) { 
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
                
            }else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", mediaFinal);
            }
        }
            
        sc.close();
    }
}

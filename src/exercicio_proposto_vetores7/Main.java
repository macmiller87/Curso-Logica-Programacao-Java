/**
 * @author Macmiller
 */

// Armazena N quantidades de nomes de alunos em um vetor, armazena as notas desses alunos do 1 semestre em outro vetor, 
// armazena as notas desses alunos do 1 semestre em outro vetor, em seguida calcula as notas do 1 e 2 semestre com seus respectivos indices de entrada
// após verifica quais alunos foram aprovados com média >= a 6.

package exercicio_proposto_vetores7;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        String[] nomesAlunos = new String[num];
        double[] notas1semestre = new double[num];
        double[] notas2semestre = new double[num];
        
        for(int i = 0; i < num; i++) {
            nomesAlunos[i] = sc.next();
            notas1semestre[i] = sc.nextDouble();
            notas2semestre[i] = sc.nextDouble();
        }
        
        double mediaTotalSemestres = 0;
        double mediaAprovados = 0;
        double mediaNotas = 0;
        
        for(int j = 0; j < num; j ++) {
            mediaTotalSemestres = notas1semestre[j] + notas2semestre[j];
            mediaNotas = mediaTotalSemestres / 2;
            
            if(mediaNotas >= 6.0) {
                mediaAprovados = mediaNotas;
                System.out.printf(nomesAlunos[j] + " %.1f \n", mediaAprovados);
            }   
        }
        
        sc.close();
    }
}

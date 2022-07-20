/**
 * @author Macmiller
 */
package beecrowd1020;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade = sc.nextInt();
        
        int ano = 365;
        int mes = 30;
        
        int resultadoAno = idade / ano;
        int resto = idade % ano;
        int resultadoMes = resto / mes;
        int resultadoDia = resto % mes;
        
        System.out.println(resultadoAno + " ano(s)");
        System.out.println(resultadoMes + " mes(es)");
        System.out.println(resultadoDia + " dia(s)");
        sc.close();
    }
}

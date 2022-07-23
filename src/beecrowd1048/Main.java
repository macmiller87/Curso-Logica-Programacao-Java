/**
 * @author Macmiller
 */
package beecrowd1048;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       
        double valorSalario = sc.nextDouble();
        
        double reajusteSalario;
        double novoSalario;
        double QuantReajusteSalario;
        int faixaReajusteSalario;
      
        if(valorSalario >= 0 && valorSalario <= 400.00) {
            
            reajusteSalario = (valorSalario * 0.15);
            novoSalario = reajusteSalario + valorSalario;;
            QuantReajusteSalario = novoSalario - valorSalario;
            faixaReajusteSalario = 15;
            
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", QuantReajusteSalario);
            System.out.println("Em percentual: " + faixaReajusteSalario + " %");
            
        }else if(valorSalario >= 400.01 && valorSalario <= 800.00) {
            
            reajusteSalario = (valorSalario * 0.12);
            novoSalario = reajusteSalario + valorSalario;;
            QuantReajusteSalario = novoSalario - valorSalario;
            faixaReajusteSalario = 12;
            
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", QuantReajusteSalario);
            System.out.println("Em percentual: " + faixaReajusteSalario + " %");
            
        }else if(valorSalario >= 800.01 && valorSalario <= 1200.00) {
            
            reajusteSalario = (valorSalario * 0.10);
            novoSalario = reajusteSalario + valorSalario;;
            QuantReajusteSalario = novoSalario - valorSalario;
            faixaReajusteSalario = 10;
            
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", QuantReajusteSalario);
            System.out.println("Em percentual: " + faixaReajusteSalario + " %");
            
        }else if(valorSalario >= 1200.01 && valorSalario <= 2000.00) {
            
            reajusteSalario = (valorSalario * 0.7) / 10;
            novoSalario = reajusteSalario + valorSalario;;
            QuantReajusteSalario = novoSalario - valorSalario;
            faixaReajusteSalario = 7;
            
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", QuantReajusteSalario);
            System.out.println("Em percentual: " + faixaReajusteSalario + " %");
            
        }else {
        
            reajusteSalario = (valorSalario * 0.4) / 10;
            novoSalario = reajusteSalario + valorSalario;
            QuantReajusteSalario = novoSalario - valorSalario;
            faixaReajusteSalario = 4;
            
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", QuantReajusteSalario);
            System.out.println("Em percentual: " + faixaReajusteSalario + " %");
        }
        
        sc.close();
    }
}

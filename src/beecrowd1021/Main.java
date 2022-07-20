/**
 * @author Macmiller
 */
package beecrowd1021;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        /* double N = sc.nextDouble();
        
        // Notas
        int nota100 = (int)N / 100;
        int nota50 = (((int)N % 100) / 50);
        int nota20 = ((((int)N % 100) % 50) / 20);
        int nota10 = (((((int)N % 100) % 50) % 20) / 10);
        int nota5 = ((((((int)N % 100) % 50) % 20) % 10) / 5);
        int nota2 = (((((((int)N % 100) % 50) % 20) % 10) % 5) / 2);
        
        // Moedas
        int moeda1 = (int) (((((((N % 100) % 50) % 20) % 10) % 5) % 2) / 1);
        int moeda050 = (int) ((((((((N % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50);
        int moeda025 = (int) (((((((((N % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25);
        int moeda010 = (int) ((((((((((N % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10);
        int moeda005 = (int) (((((((((((N % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) / 0.05);
        int moeda001 = (int) ((((((((((((N % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05) / 0.01);
        
        
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");
        sc.close(); */
        
        double N;
	int quociente, resto, nota, moeda;
		
	N = sc.nextDouble();

	resto = (int) (N * 100.0 + 0.5);

	System.out.println("NOTAS:");
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 5;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
	    resto = resto % (nota * 100);

	    System.out.println("MOEDAS:");
            
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
	    resto = resto % moeda;

		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
	    resto = resto % moeda;

		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
	    resto = resto % moeda;

		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
	    resto = resto % moeda;

		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
	    resto = resto % moeda;

		System.out.println(resto + " moeda(s) de R$ 0.01");
                
                sc.close();
    }
}

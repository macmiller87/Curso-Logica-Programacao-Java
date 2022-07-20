/**
 * @author Macmiller
 */
package beecrowd1012;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double areaTrianguloRetangulo = A * C / 2.0;
        double areaCirculoRaio = C * C * 3.14159;
        double areaTrapezio = (A + B) / 2.0 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        
        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculoRaio);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
        sc.close();
    }
}

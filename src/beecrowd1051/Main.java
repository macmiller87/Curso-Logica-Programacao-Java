/**
 * @author Macmiller
 */
package beecrowd1051;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioPessoa = sc.nextDouble();

        double impostoAPagar;

        if (salarioPessoa >= 0 && salarioPessoa <= 2000.00) {
            System.out.println("Isento");

        } else if (salarioPessoa >= 2000.01 && salarioPessoa <= 3000.00) {
            impostoAPagar = (salarioPessoa - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", impostoAPagar);

        } else if (salarioPessoa >= 3000.01 && salarioPessoa <= 4500.00) {
            impostoAPagar = (salarioPessoa - 3000.00) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f\n", impostoAPagar);

        } else {
            impostoAPagar = (salarioPessoa - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            System.out.printf("R$ %.2f\n", impostoAPagar);
        }

        sc.close();
    }
}

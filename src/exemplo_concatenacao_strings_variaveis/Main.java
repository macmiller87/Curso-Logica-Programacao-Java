/**
 * @author Macmiller
 */
package exemplo_concatenacao_strings_variaveis;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        double y  = 32.5555;
        
        System.out.printf("%.4f%n", y);
        
        // Método para imprimir (. ou ,) conforme regras de cada pais.
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", y);
        
        // Exemplo para passar o resultado de uma variavel com texto e quebrando linha.
        System.out.printf("Resultado = %2f metros %n", y);
    }
    
}

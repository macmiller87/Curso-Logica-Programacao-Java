/**
 * @author Macmiller
 */
package beecrowd1114;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int userSenha = sc.nextInt();
        int senha = 2002;
        
        while(userSenha != senha) {
            
            if(userSenha != senha) {
                System.out.println("Senha Invalida");
            }
            
            userSenha = sc.nextInt();
        }
        
        if(userSenha == senha) {
            System.out.println("Acesso Permitido");
        }
        
        sc.close();
    }
}

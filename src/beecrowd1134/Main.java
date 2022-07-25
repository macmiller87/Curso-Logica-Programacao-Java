/**
 * @author Macmiller
 */
package beecrowd1134;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
     
     int alcool = 0;
     int gasolina = 0;
     int diesel = 0;
     
     //System.out.println("Qual combustivel deseja abastecer? (1.Álcool 2.Gasolina 3.Diesel)");
     int userCombustivel = sc.nextInt();
     
     while(userCombustivel != 4) {
     
         switch(userCombustivel) {
         
             case 1:
                 alcool++;
                 //System.out.println("Qual combustivel deseja abastecer? (1.Álcool 2.Gasolina 3.Diesel)");
                 userCombustivel = 0;
                 userCombustivel = sc.nextInt();
                 break;
             case 2:
                 gasolina++;
                 //System.out.println("Qual combustivel deseja abastecer? (1.Álcool 2.Gasolina 3.Diesel)");
                 userCombustivel = 0;
                 userCombustivel = sc.nextInt();
                 break;
             case 3:
                 diesel++;
                 //System.out.println("Qual combustivel deseja abastecer? (1.Álcool 2.Gasolina 3.Diesel)");
                 userCombustivel = 0;
                 userCombustivel = sc.nextInt();
                 break;
             default:
                 //System.out.println("(fora da faixa de 1 a 4)");
                 //System.out.println("Qual combustivel deseja abastecer? (1.Álcool 2.Gasolina 3.Diesel)");
                 userCombustivel = 0;
                 userCombustivel = sc.nextInt();
            }
        }
     
     if(userCombustivel == 4) {
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
     }
     
     sc.close();
    }
}

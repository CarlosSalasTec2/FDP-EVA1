
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_13_IF {

    public static void main(String[] args) {
    int edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca su edad");
        edad=input.nextInt();
        if ((2025-edad)>=18) {
            System.out.println("Puedes comprar bebidas alcoholicas");
        }else{
            System.out.println("No puedes comprar bebidas alcoholicas");
    }
    } 
}

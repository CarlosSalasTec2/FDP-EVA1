
package eva1_12_if;

import java.util.Scanner;


public class EVA1_12_IF {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca su calificación");
        califa=input.nextInt();
        if (califa>=70) {
            System.out.println("Usted ah aprovado");
        }else{
            System.out.println("Usted NO ah aprovado");
        }
        
    }
    
}

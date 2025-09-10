/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double monto,R,resta;
        Scanner input = new Scanner(System.in);
        
        System.out.println("De cuanto es su monto?");
        monto=input.nextDouble();
        if (monto>1800){
        resta=monto*.15;
        R=monto-resta;
         System.out.print("Su monto a pagar es:");
         System.out.print(R);
        }else{
        System.out.print("Su monto a pagar es:");
         System.out.print(monto);
        }
        
    }
    
}

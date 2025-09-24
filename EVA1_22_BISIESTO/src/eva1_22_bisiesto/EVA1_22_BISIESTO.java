/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisiesto;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_22_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year, resi4 ,resi100,resi400;
        Scanner input = new Scanner(System.in);
        
        System.out.println("año a evaluar");
        year=input.nextInt();
        resi4= year%4;
        resi100=year%100;
        resi400=year%400;
        if(resi4==0){//division exacta entre 4
            if(resi100==0){//puede
                if(resi400==0){
                System.out.print("el año " + year + " es bisiesto");
                }else{
                System.out.print("el año "+year+" No es bisiesto ");
                }
            
            }else{//no es divisible entre 100
                System.out.print("el año "+year+" es bisiesto");
            }
        }else{
            System.out.print("el año "+year+" No es bisiesto ");
        }
    }
    
}

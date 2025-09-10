/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cuál es el primer numero?");
        a=input.nextInt();
        System.out.println("Cuál es el segundo numero?");
        b=input.nextInt();
        
        if (a>b){
        System.out.print("El numero mas grande es:");
        System.out.print(a);
        }else{
            if(a<b){
        System.out.print("El numero mas grande es:");
        System.out.print(b);
            }else{
            System.out.println("ambos numeros son iguales");
            }
        }
    }
    
}

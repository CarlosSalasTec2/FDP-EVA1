/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego_aguila_sol;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_24_JUEGO_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int usuario;
        double num;
        System.out.println("Aguila o sello? (1/0)");
        usuario = input.nextInt();
        num = Math.random();
        System.out.println(num);
        if (num>0.5){System.out.println("Salio aguila!");
        if (usuario==1){
        System.out.println("Ganaste!");
        }else{ System.out.println("Perdiste!");        }
          }else{ System.out.println("Salio sello!");}
        if (usuario==0){System.out.println("Ganaste!");
        }else{System.out.println("Perdiste!");
        }
    }
    
}

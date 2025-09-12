/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA1_19_ANTRO {

    final static String ed="18";
    final static String INE="Si";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in,edad;
        Scanner input = new Scanner (System.in);
        System.out.println("******BIENVENIDO******");
        System.out.println("Antro los Mateos");
        System.out.println("Cual es su edad?");
        edad=input.nextLine();
        System.out.println("Tiene INE?");
        in=input.nextLine();
        if (edad.equals(ed)){
        if (in.equals(INE)){
        System.out.println("Puede entrar");
        }else{
        System.out.println("No puede entrar");
        }
    }else{
            System.out.println("No puede entrar");
            }
    }
    
}

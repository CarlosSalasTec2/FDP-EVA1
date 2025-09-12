/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_18_acceso;

import java.util.Scanner;

/**
 *
 * @author anago
 */
public class EVA_18_ACCESO {
    //CONSTATANTES Iidentidicadores que no pueden cambiar valor
    final static String USUARIO="Alex";
    final static String PWD="1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu,contra;
        Scanner input = new Scanner (System.in);
        System.out.println("******BIENVENIDO******");
        System.out.println("Sistema de venta Restaurante");
        System.out.println("usuario");
        usu=input.nextLine();
        System.out.println("Contraseña");
        contra=input.nextLine();
        if (usu.equals(USUARIO)){
        if (contra.equals(PWD)){
        System.out.println("Correcto");
        }else{
        System.out.println("Incorrecto");
        }
    }else{
            System.out.println("Incorrecto");
            }
    
        
}
}
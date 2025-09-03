
package eva1_9_captura;

import java.util.Scanner;


public class EVA1_9_CAPTURA {
        public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//crea el scanner
        
        System.out.println("introduce tu nombre completo");//capturar de datos
        nombre=input.nextLine();//captura texto
        System.out.println("introduce tu edad");//capturar de datos
        edad=input.nextInt();//captura texto
        System.out.println("introduce tu promedio de la preparatoria");//capturar de datos
        promedio=input.nextDouble();//captura texto
        System.out.println("El nombre es:");
        System.out.println(nombre);
        System.out.println("La edad es:");
        System.out.println(edad);
        System.out.println("El promedio es:");
        System.out.println(promedio);
    }
    
}

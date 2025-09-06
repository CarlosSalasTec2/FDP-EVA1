
package eva1_10_captura;

import java.util.Scanner;


public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VELOCIDAD = DISTANCIA/TIEMPO
        //M/S
        double m,s,v;
        Scanner input = new Scanner(System.in);
        
        System.out.println("introduce la distancia en metros");
        m=input.nextDouble();
        System.out.println("introduce el tiempo en segundos");
        s=input.nextDouble();
        v=m/s;
        System.out.print("la velocidad es:");
        System.out.print(v);
        System.out.print("m/s");
    }
    
}

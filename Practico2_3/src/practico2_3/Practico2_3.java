package practico2_3;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 * Comision 17
 */
import java.util.Scanner;
public class Practico2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario la edad por consola
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if(edad<12){
            System.out.println("Niño");
        }
        if(edad>=12 && edad<=17){
            System.out.println("Adolescente");
        }
        if(edad>=18 && edad<=59){
            System.out.println("Adulto");
        }
        if(edad>=60){
            System.out.println("Adulto mayor");
        }
        scanner.close();
    }
    
}

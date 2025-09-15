package practico2_1;
/**
 *
 * @author FABIAN ALEJANDRO SALAS
 * Comisión 17
 * 
 */
// Librería de lectura de datos
import java.util.Scanner;

public class Practico2_1{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
        // Lee año por consola 
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();

        // Verifica si es bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
        scanner.close();
    }
}

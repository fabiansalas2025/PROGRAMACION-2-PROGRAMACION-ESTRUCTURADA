package practico2_5;

/**
 *
 * @author FABIAN
 */
import java.util.Scanner;
public class Practico2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma=0;
        // Pide un nro cualquiera por consola
        System.out.print("Ingrese un número (0 para terminar) :");
        int n = scanner.nextInt();
        
        while(n!=0){
            // Verifica si es par
            if(n % 2 == 0){
                // Suma los nros pares
                suma = suma + n;
            }
            System.out.print("Ingrese un número (0 para terminar) :");
            n = scanner.nextInt();
        }
        // Muestra la suma total de todos los nros. pares
        System.out.println("La suma de número pares es: " + suma);
    }
    
}

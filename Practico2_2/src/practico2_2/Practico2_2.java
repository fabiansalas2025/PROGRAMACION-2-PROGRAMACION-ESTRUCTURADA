package practico2_2;

/**
 *
 * @author FABIAN
 * comision 17
 */
import java.util.Scanner;
public class Practico2_2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int aux;
       
        // Lee números por consola 
       System.out.print("Ingrese el primer número: ");
       int n1 = scanner.nextInt();
       System.out.print("Ingrese el segundo número: ");
       int n2 = scanner.nextInt();
       System.out.print("Ingrese el tercer número: ");
       int n3 = scanner.nextInt();
       
       if (n1 >= n2 && n1 >= n3) {
            aux = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            aux = n2;
        } else {
            aux= n3;
        }

        // Mostrar resultado
        System.out.println("El número mayor es: " + aux);

        scanner.close();
        
    }
    
}

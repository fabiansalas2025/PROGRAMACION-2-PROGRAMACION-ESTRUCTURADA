package practico2_13;
import java.util.Scanner;
/**
 *
 * @author FABIAN
 * comision 17
 */
public class Practico2_13 {

    // Función recursiva para mostrar los precios
    public static void mostrarPrecios(double[] precios, int indice) {
        // Caso base: cuando llegamos al final del array
        if (indice == precios.length) {
            return;
        }

        // Imprimir el precio en la posición actual
        System.out.println("Precio ("+indice+"): $" + precios[indice]);

        // Llamada recursiva al siguiente índice
        mostrarPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        int i;

        // b. Mostrar precios originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        
        System.out.print("Ingrese el precio que desea modificar : ");
        i = scanner.nextInt();
        System.out.println("Precio (" + i + ") $" +precios[i]);
         
        System.out.print("Ingrese el nuevo precio : $ ");
        precios[i] = scanner.nextDouble();

        // d. Mostrar precios modificados
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }
    
}

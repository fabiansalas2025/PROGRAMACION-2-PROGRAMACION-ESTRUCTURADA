package practico2_11;
import java.util.Scanner;
/**
 *
 * @author FABIAN
 * comisión 17
 */
public class Practico2_11 {
    // Variable "global" (estática) con el 10% de descuento
    static double DESCUENTO_ESPECIAL = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        // Solicitar el precio
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Llamar al método
        calcularDescuentoEspecial(precio);
        
        scanner.close();
    }
    
}

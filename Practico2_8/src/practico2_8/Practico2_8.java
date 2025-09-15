package practico2_8;

/**
 *
 * @author FABIAN
 * comision 17
 */
import java.util.Scanner;

public class Practico2_8 {
     // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertimos los porcentajes a decimales
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;

        // Fórmula: PrecioFinal = PrecioBase + (PrecioBase × Impuesto) − (PrecioBase × Descuento)
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        return precioFinal;
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
          // Entrada de datos
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        // Llamada al método
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Salida
        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
         
    }
    
}

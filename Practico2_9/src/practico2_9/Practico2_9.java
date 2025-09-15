package practico2_9;

import java.util.Scanner;

/**
 *
 * @author FABIAN
 * comision 17
 */
public class Practico2_9 {
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio=0;
        
        if(zona.equals("Nacional")){
            costoEnvio = peso * 5;
        }
        if(zona.equals("Internacional")){
            costoEnvio = peso * 10;
        }
        return costoEnvio;
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        
        double Total = precioProducto + costoEnvio;
        return Total;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
          // Entrada del precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        
         
          // Entrada del peso del producto
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
         
          // Entrada de la zona del envío
        System.out.print("Ingrese la zona del envío(Nacional/Internacional): ");
        String zona = scanner.next(); 
        
        double costoEnvio= calcularCostoEnvio(peso, zona);
        double Total = calcularTotalCompra(precio, costoEnvio);
        
        System.out.println("Costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + Total);
       
        scanner.close();
       
    }
    
}

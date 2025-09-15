package practico2_10;
import java.util.Scanner;
/**
 *
 * @author FABIAN
 * comision 17
 */
public class Practico2_10 {

    public static int actualizarStock(int StockActual, int CantidadVendida, int CantidadRecibida){
        
        int NuevoStock = StockActual - CantidadVendida + CantidadRecibida;
        return NuevoStock;     
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese el stock del producto: ");
       int cant_Productos = scanner.nextInt();
       
       System.out.print("Ingrese la cantidad vendida: ");
       int cant_Vendida = scanner.nextInt();
       
       System.out.print("Ingrese la cantidad recibida: ");
       int cant_Recibida = scanner.nextInt();
       
       int stock = actualizarStock(cant_Productos, cant_Vendida, cant_Recibida);
       
       System.out.println("El nuevo stock del producto es: " + stock);
       scanner.close();       
    }
    
}

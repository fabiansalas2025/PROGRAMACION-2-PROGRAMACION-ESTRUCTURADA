package practico2_12;


import java.util.Scanner;
/**
 *
 * @author FABIAN
 * comision 17
 */
public class Practico2_12 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int i;
         double[] precios = {22.2, 33.2, 89.9, 36.78, 53.89, 90.34};
         
         System.out.println("Los precios originales:");
         int tamanio = precios.length;
         for(i=0; i < tamanio; i++){
             System.out.println("Precio ("+ i +") $ " + precios[i]);
         }
         System.out.print("Ingrese el precio que desea modificar : ");
         i = scanner.nextInt();
         System.out.println("Precio (" + i + ") $" +precios[i]);
         
         System.out.print("Ingrese el nuevo precio : $ ");
         precios[i] = scanner.nextDouble();
         
         System.out.println("Nuevos precios: ");
         for(i=0; i < tamanio; i++){
             System.out.println("Precio ("+ i +") $ " + precios[i]);
         }
         
         
    }
    
}

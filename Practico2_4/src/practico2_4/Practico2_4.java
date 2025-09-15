package practico2_4;
/**
 *
 * @author FABIAN SALAS
 * Comision 17
 */
import java.util.Scanner;

public class Practico2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pide al usuario el precio por consola
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        double valor_final=0;
        double desc=0;
        
        // Pide al usuario la categoría por consola
        System.out.print("Ingrese la categoria del producto A B C: ");
        char c = scanner.next().charAt(0);
        if(precio>0){
            switch (c){
                case 'A':
                    desc = 10;
                    valor_final = precio - (precio*10/100);
                    break;
                case 'B':
                    desc = 15;
                    valor_final = precio - (precio*15/100);
                    break;
                case 'C':
                    desc = 20;
                    valor_final = precio - (precio*20/100);
                    break;
                default:
                    c = 'X';
                    valor_final = precio;
            }
        }else 
            System.out.println("Debe ingresar un valor positivo.");
        
      System.out.println("Precio :" + precio + " Categoria:  " + c);  
      System.out.println("Descuento :" + desc + " Valor Final:  " + valor_final);
     
      scanner.close();
    }
    
}

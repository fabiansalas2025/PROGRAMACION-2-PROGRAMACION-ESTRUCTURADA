package practico2_7;

/**
 *
 * @author FABIAN
 * comisión 17
 */
import java.util.Scanner;
public class Practico2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota=0;
        int bandera=0;
        do{
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            if(nota >=0 && nota<=10){
                bandera=1;
            }else
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
                
        }while(bandera!=1);
        System.out.println("Nota guardada correctamente.");
    }
    
}

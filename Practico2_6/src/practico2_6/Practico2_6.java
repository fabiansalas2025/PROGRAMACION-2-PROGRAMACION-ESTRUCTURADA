package practico2_6;

/**
 *
 * @author FABIAN
 * comisión 17
 */
import java.util.Scanner;
public class Practico2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativos=0;
        int positivos=0;
        int ceros=0;
        for(int i=1; i<=10; i++){
            System.out.print("Ingrese un numero " + i +" : ");
            int n = scanner.nextInt();
            if(n<0){
                negativos++;
            }
            if(n>0){
                positivos++;
            }
            if(n==0){
                ceros++;
            }
        }
        System.out.println("Positivos : " + positivos);
        System.out.println("Negativos : " + negativos);
        System.out.println("Ceros : " + ceros);
        scanner.close();
    }
}

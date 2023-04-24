package efectos.programa;
import efectos.clases.*;
import java.util.Scanner;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej32 {
    public static void main(String[] args) {
        System.out.println("Dame una frase");
        String frase = new Scanner (System.in). nextLine();
        EfectoMayusculas e1 = new EfectoMayusculas();
        EfectoInverso e2 = new EfectoInverso();
        EfectoGuiones e3 = new EfectoGuiones();
        EfectoCorchetes e4 = new EfectoCorchetes();
        
        
        System.out.println("1. Aplicar todos los efectos a la frase");
        System.out.println("2. Aplicar solo los efectos simetricos");
        int num = new Scanner (System.in). nextInt();
        
        switch(num){
            case 1:
                System.out.println(e1.aplicarEfecto(frase));
                System.out.println(e2.aplicarEfecto(frase));
                System.out.println(e3.aplicarEfecto(frase));
                System.out.println(e4.aplicarEfecto(frase));
            break;
            case 2:
                System.out.println(e2.aplicarEfecto(frase));
                System.out.println(e4.aplicarEfecto(frase));
            break;
            default:
                System.out.println("Numero incorrecto");
        }
    }
    
}

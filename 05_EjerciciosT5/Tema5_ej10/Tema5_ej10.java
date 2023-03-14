package tema5_ej10;
import java.util.Scanner;
import tema5_ej10.Adivinanzas;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej10 {
    public static void main(String[] args) {
        Adivinanzas a1= new Adivinanzas("pepe?", "Ivan Castro");
        
        System.out.println("ENUNCIADO\n"+a1.getEnunciado());;
        
        
        try{
            String respuesta = new Scanner(System.in).nextLine();
            a1.comprobar(respuesta);
        }catch(AdivinanzaIncorrectaException | TiempoSuperadoException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

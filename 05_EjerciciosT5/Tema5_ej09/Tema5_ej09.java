package tema5_ej09;
import tema5_ej09.Programador;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programador p1= new Programador("Pepe", 2000, 78265677, 
                'Z', 100);
        p1.aprenderLenguaje("Java", "Hola Mundo");
        System.out.println(p1.programarHolaMundo("Java"));
        System.out.println(p1.programarHolaMundo("Python"));
    }    
}

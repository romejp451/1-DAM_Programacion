package tema5_ej25;
import daw.zoo.ContenedorAnimales;
import daw.zoo.Jaula;
import daw.zoo.Leon;
import daw.zoo.Tigre;
import daw.zoo.TransporteAnimales;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej25 {
    public static void main(String[] args) {
        Leon l1 = new Leon ("Juan", 3);
        Leon l2 = new Leon ("Juan1", 3);
        Leon l3 = new Leon ("Juan2", 3);
        Leon l4 = new Leon ("Juan3", 3);
        Leon l5 = new Leon ("Juan4", 3);
        Leon l6 = new Leon ("Juan5", 3);
        Leon l7 = new Leon ("Juan6", 3);
        Leon l8 = new Leon ("Juan8", 3);
        Tigre t1 = new Tigre ("Juan7", 3);
        TransporteAnimales j1 = new TransporteAnimales();
        j1.añadir(l7);
        j1.añadir(l1);
        j1.añadir(l2);
        j1.añadir(l3);
        j1.añadir(l4);
        System.out.println(j1.getNumeroAnimales());
        System.out.println(j1.comprobarDisponibilidadPlaza(l8));
    }
    
}

package clases06;
import clases06.coordenadas;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Clases06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        coordenadas c1 = new coordenadas();
        
        coordenadas c2 = new coordenadas(8787878,86868);
        
        
        System.out.println(c2.getCoordenadaX());
        System.out.println(c2.getCoordenadaY());
        
    }
    
}

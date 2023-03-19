package tema5_ej20;
import tema5_ej20.TransportistaOrdenado;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej20 {
    public static void main(String[] args) {
        Paquete p1= new Paquete("Magdalenas", "casa", 1);
        Paquete p2= new Paquete("Pan", "casa", 3);
        Paquete p3= new Paquete("Papas", "casa", 2);
        
        Transportista t1= new TransportistaOrdenado(1);
        t1.subirCamnion(p3);
        t1.subirCamnion(p2);
        t1.subirCamnion(p1);
        try{
            t1.enviar();
        }catch(InterruptedException e){} 
        
    }
    
}

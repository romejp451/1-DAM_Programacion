package tema5_ej19;
import tema5_ej19.Paquete;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej19 {
    public static void main(String[] args) {
        Paquete p1= new Paquete("Melon", "Mi casa", 3);
        Paquete p2= new Paquete("Melon", "Mi casa", 2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        
        System.out.println(p1.compareTo(p2));
        
        Transportista t1= new Transportista (1);
        t1.subirCamnion(p1);
        t1.subirCamnion(p2);
        try{
            t1.enviar();
        }catch (InterruptedException e){}
        
    
    }
}

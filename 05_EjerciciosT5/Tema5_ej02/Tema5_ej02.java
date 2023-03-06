package tema5_ej02;
import tema5_ej02.Compras;
/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Tema5_ej02 {
    public static void main(String[] args){
        Compras c1= new Compras(100);
        try{
            c1.registrarCompra(80);
        }catch(Exception e){
            System.out.println("Errir "+e.getMessage());
        }
        try{
            c1.registrarCompra(80);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
        
        
        
    }
    
}

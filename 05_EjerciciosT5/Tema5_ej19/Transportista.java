package tema5_ej19;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class Transportista{
    //VALORES
    private List <Paquete> paquetes;
    private long timepoEntrega;

    public Transportista(long timepoEntrega) {
        this.timepoEntrega = timepoEntrega*60000;
        this.paquetes = new ArrayList<Paquete>();
    }
    
    //SETTERS
    
    public void subirCamnion(Paquete p){
        this.paquetes.add(p);
    };
    
    public void enviar() throws InterruptedException{
        for (Paquete p : this.paquetes){
            String aux = "El paquete "+p.getProducto()+" con prioridad "
                    +p.getPrioridad()+" ha llegado a: "+p.getDireccionDestino();
            Thread.sleep(timepoEntrega);
            System.out.println(aux);
        }
    };
    
    
}

package tema5_ej20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class TransportistaOrdenado extends Transportista{
    private List <Paquete> paquetes;
    private long timepoEntrega;

    public TransportistaOrdenado(long timepoEntrega) {
        super(timepoEntrega);
        this.paquetes = new ArrayList<Paquete>();
    }
    
    public void subirCamion(Paquete p){
        super.subirCamnion(p);
    }
    
    @Override
    public void enviar() throws InterruptedException{
        Collections.sort(paquetes, new Comparator<Paquete>() {
            public int compare(Paquete o1, Paquete o2) {
                return Integer.compare(o2.getPrioridad(), o1.getPrioridad());
            }
        });
        super.enviar();
    }
    
}

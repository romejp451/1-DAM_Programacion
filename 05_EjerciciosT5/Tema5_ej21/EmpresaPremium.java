package tema5_ej21;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EmpresaPremium implements EmpresaPaqueteria{
    //VALORES
    private Transportista rapido;
    private Transportista medio;
    private Transportista lento;
    
    //CONSTRUCTORES

    public EmpresaPremium() {
        this.rapido = new Transportista(10);
        this.medio = new Transportista(25);
        this.lento = new Transportista(50);
    }
    
    
    
    @Override
    public void registrarPedido(Paquete p) {
        if (p.getPrioridad()==1) {
            this.rapido.subirCamnion(p);
        }
        if (p.getPrioridad()==2) {
            this.medio.subirCamnion(p);
        }
        if (p.getPrioridad()==3) {
            this.lento.subirCamnion(p);
        }
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.add(this.rapido);
        transportista.add(this.medio);
        transportista.add(this.lento);
        return transportista;
    }

    @Override
    public void enviarPaquetes() {
        try{
            this.rapido.enviar();
            this.medio.enviar();
            this.lento.enviar();
        }catch(InterruptedException e){}
        
    }
    
}

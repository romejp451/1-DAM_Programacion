package tema5_ej21;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class PaquetesPepe implements EmpresaPaqueteria{
    //VALORES
    private TransportistaOrdenado pepe;
    
    //CONSTRUCTOR

    public PaquetesPepe() {
        this.pepe = new TransportistaOrdenado(30);
    }
    
    
    @Override
    public void registrarPedido(Paquete p) {
        this.pepe.subirCamion(p);
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.add(this.pepe);
        return transportista;
    }

    @Override
    public void enviarPaquetes() {
        try{
            this.pepe.enviar();
        }catch(InterruptedException e){}
    }
    
}

package tema5_ej22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Romeo <romejp451@gmail.com>
 */
public class EmpresaLowCost implements EmpresaPaqueteria{
    //VALORES
    private Transportista[] transportistas;
    private int siguienteTransportista;
    
    //CONSTRUCTOR
    EmpresaLowCost(int n){
        this.transportistas = new Transportista[n];
        Transportista trans;
        Random ra = new Random();
        for (int i = 0; i < n; i++) {
            trans= new Transportista(ra.nextInt(40, 80));
            this.transportistas[i] = trans;
        }
        this.siguienteTransportista = -1;
    }
    
    @Override
    public void registrarPedido(Paquete p) {
        this.siguienteTransportista++;
        this.transportistas[this.siguienteTransportista].subirCamnion(p);
    }

    @Override
    public List<Transportista> getTransportistas() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.addAll(Arrays.asList(this.transportistas));
        return transportista;
    }

    @Override
    public void enviarPaquetes() {
            try{
                transportistas[this.siguienteTransportista].enviar();
            }catch (InterruptedException e){}
    }
    
}
